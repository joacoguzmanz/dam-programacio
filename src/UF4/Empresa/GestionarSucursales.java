package UF4.Empresa;

import Toolkit.UsersUtil;

import java.util.List;

public class GestionarSucursales {
    private static int ultimoId = 0;

    public static void crearSucursal(List<Sucursal> sucursales) {
        String nombre = UsersUtil.getStringFromUser("Ingrese el nombre", "Ingrese solo letras");
        String direccion = UsersUtil.getStringFromUser("Ingrese la direccion", "Ingrese solo letras");
        int telefono = UsersUtil.getIntFromUser("Ingrese telefono", "Ingrese solo numeros");
        String email = UsersUtil.getEmailFromUser("Ingrese mail", "Ingrese formato correcto");

        ultimoId++;
        sucursales.add(new Sucursal(ultimoId, nombre, direccion, telefono, email));
    }

    public static void modificarSucursales(List<Sucursal> sucursals) {

    }
}
