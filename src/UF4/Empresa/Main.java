package UF4.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();

        Producto producto1 = new Producto("Reloj", 1, 25.5,33, true);
        Producto producto2 = new Producto("Crema", 2, 30,5, false);

        listaProductos.add(producto1);
        listaProductos.add(producto2);

        for (Producto producto : listaProductos) {
            System.out.println(producto.getNombre());
        }
    }
}
