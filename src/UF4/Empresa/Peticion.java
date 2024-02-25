package UF4.Empresa;

/**
 * Representa una petición hecha por un cliente a la empresa
 */
public class Peticion {
    private int cantidad;

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

    /**
     * Asigna un producto a la petición, especificado por su tipo.
     *
     * @param tipoProducto El tipo de producto que se va a asignar a la petición.
     */
    public void asignarProducto(TipoProducto tipoProducto) {

    }
}
