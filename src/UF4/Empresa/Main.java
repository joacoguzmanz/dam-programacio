package UF4.Empresa;

import java.util.ArrayList;
import java.util.List;
import Toolkit.UsersUtil;

public class Main {
    public static void main(String[] args) {
        List<Sucursal> listadoSucursales = new ArrayList<>();
        int option = menu();
        boolean goOn;

        do {
            switch (option) {
                case 1:
                    GestionarSucursales.crearSucursal(listadoSucursales);
                    break;
                case 2:
                    // GestionarSucursales.modificarSucursal(listadoSucursales);
                    break;
                case 9:
                    break;
            }


            goOn = continueMenu();
        } while (goOn);

        for (Sucursal sucursal : listadoSucursales) {
            System.out.println(sucursal.getNombre());
        }
    }

    public static int menu() {
        System.out.println("Menu");
        System.out.println("1 - Alta de Sucursal");
        System.out.println("2 - Alta de Producto");
        System.out.println("3 - Alta de Cliente");
        System.out.println("9 - Alta de Cliente");

        return UsersUtil.getIntFromUser("Ingrese una opción", "Ingrese un número");
    }

    public static boolean continueMenu() {
        boolean response = false;
        System.out.print("Desea continuar? 1-Si / 2-No: ");
        int userInput = UsersUtil.getIntFromUser("Ingrese una opción", "Ingrese un número");
        if (userInput == 1) {
            response = true;
        }
        return response;
    }
}
