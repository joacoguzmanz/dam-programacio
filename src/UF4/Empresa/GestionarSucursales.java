package UF4.Empresa;

import Toolkit.UsersUtil;

import java.util.List;

public class GestionarSucursales {
    private static int ultimoId = 0;

    public static Sucursal getById(int id, List<Sucursal> sucursales) {
        Sucursal selected = null;
        for (Sucursal sucursal : sucursales) {
            if (sucursal.getId() == id)
                selected = sucursal;
        }
        return selected;
    }

    public static void crearSucursal(List<Sucursal> sucursales) {
        String nombre = UsersUtil.getStringFromUser("Ingrese el nombre", "Ingrese solo letras");
        String direccion = UsersUtil.getStringFromUser("Ingrese la direccion", "Ingrese solo letras");
        int telefono = UsersUtil.getIntFromUser("Ingrese telefono", "Ingrese solo numeros");
        String email = UsersUtil.getEmailFromUser("Ingrese mail", "Ingrese formato correcto");

        ultimoId++;
        sucursales.add(new Sucursal(ultimoId, nombre, direccion, telefono, email));
    }

    public static void listarSucursales(List<Sucursal> sucursales) {
        for (Sucursal sucursal : sucursales) {
            System.out.println(sucursal.getId() + ": " + sucursal.getNombre());
        }
    }

    public static void modificarSucursal(List<Sucursal> sucursales) {
        int idSucursal = UsersUtil.getIntFromUser("Ingrese ID de la sucursal", "Ingrese un número");
        for (Sucursal sucursal : sucursales) {
            if (idSucursal != sucursal.getId()) {
                System.out.println("La sucursal no existe");
            } else {
                Sucursal sucursalToMod = getById(idSucursal, sucursales);
                System.out.println("1. Nombre | 2. Direccion | 3. Telefono | 4. Mail");
                int option = UsersUtil.getIntFromUser("Que desea modificar", "Ingrese un número");
                switch (option) {
                    case 1:
                        // Nombre
                        String nombre = UsersUtil.getStringFromUser("Ingrese el nombre", "Ingrese letras");
                        sucursalToMod.setNombre(nombre);
                        break;
                    case 2:
                        // Direccion
                        String direccion = UsersUtil.getStringFromUser("Ingrese la direccion", "Ingrese letras");
                        sucursalToMod.setDireccion(direccion);
                        break;
                    case 3:
                        // Telefono
                        int telefono = UsersUtil.getIntFromUser("Ingrese el telefono nuevo", "Ingrese numeros");
                        sucursalToMod.setTelefono(telefono);
                        break;
                    case 4:
                        // Mail
                        String email = UsersUtil.getEmailFromUser("Ingrese email nuevo", "Ingrese formato correcto");
                        sucursalToMod.setEmail(email);
                        break;
                }
            }
        }
    }
}
