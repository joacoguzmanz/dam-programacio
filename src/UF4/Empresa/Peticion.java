package UF4.Empresa;

import java.util.List;
import java.util.ArrayList;

/**
 * Representa una petición hecha por un cliente a la empresa
 */
public class Peticion {
    private int cantidad;
    private Producto producto;

    /**
     * Construye un nuevo objeto de tipo Peticion con cantidad.
     *
     * @param cantidad La cantidad solicitada del producto.
     */
    public Peticion(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene la cantidad solicitada del producto.
     *
     * @return La cantidad solicitada del producto.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad solicitada del producto.
     *
     * @param cantidad La cantidad solicitada del producto.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    /**
     * Asigna un producto a la petición, especificado por su tipo.
     *
     * @param producto El tipo de producto que se va a asignar a la petición.
     */
    public void asignarProducto(Producto producto) {
        this.producto = producto;
    }
}
