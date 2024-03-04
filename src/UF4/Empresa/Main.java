package UF4.Empresa;

import java.util.ArrayList;
import java.util.List;
import Toolkit.UsersUtil;

public class Main {
    public static void main(String[] args) {
        List<Sucursal> listadoSucursales = new ArrayList<>();
        boolean goOn;

        do {
            int option = menu();
            switch (option) {
                case 1:
                    GestionarSucursales.crearSucursal(listadoSucursales);
                    break;
                case 2:
                    GestionarSucursales.modificarSucursal(listadoSucursales);
                    break;
                case 3:
                    GestionarSucursales.listarSucursales(listadoSucursales);
                    break;
                case 4:
                    GestionarSucursales.listarUnaSucursal(listadoSucursales);
                case 9:
                    break;
            }

            goOn = continueMenu();
        } while (goOn);
    }

    public static int menu() {
        System.out.println("Menu");
        System.out.println("1 - Alta de sucursal");
        System.out.println("2 - Modificar sucursal");
        System.out.println("3 - Listar sucursales");
        System.out.println("4 - Listar una sucursal");
        System.out.println("5 - Dar de baja sucursal");
        System.out.println("9 - Salir");

        return UsersUtil.getIntFromUser("Ingrese una opción", "Ingrese un número");
    }

    public static boolean continueMenu() {
        boolean response = false;
        int userInput = UsersUtil.getIntFromUser("Desea continuar? [1-Si / 2-No]", "Ingrese una opción");
        if (userInput == 1) {
            response = true;
        }
        return response;
    }
}
