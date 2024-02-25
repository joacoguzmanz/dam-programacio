package UF4.Empresa;

/**
 * Representa un producto que se puede vender en la tienda.
 */
public class Producto {
    private String nombre;
    private int codigoId;
    private double precio;
    private int stock;
    private boolean enVenta;

    /**
     * Construye un nuevo objeto de tipo TipoProducto con sus detalles.
     *
     * @param nombre   El nombre del producto.
     * @param codigoId El código del producto.
     * @param precio   El precio del producto.
     * @param stock    El stock disponible del producto.
     * @param enVenta  Indica si el producto está en venta o no.
     */
    public Producto(String nombre, int codigoId, double precio, int stock, boolean enVenta) {
        this.nombre = nombre;
        this.codigoId = codigoId;
        this.precio = precio;
        this.stock = stock;
        this.enVenta = enVenta;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre El nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el código identificador del producto.
     *
     * @return El código identificador del producto.
     */
    public int getCodigoId() {
        return codigoId;
    }

    /**
     * Establece el código identificador del producto.
     *
     * @param codigoId El código identificador del producto.
     */
    public void setCodigoId(int codigoId) {
        this.codigoId = codigoId;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio El precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el stock disponible del producto.
     *
     * @return El stock disponible del producto.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el stock disponible del producto.
     *
     * @param stock El stock disponible del producto.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Indica si el producto está en venta.
     *
     * @return true si el producto está en venta, false si no lo está.
     */
    public boolean isEnVenta() {
        return enVenta;
    }

    /**
     * Establece si el producto está en venta o no.
     *
     * @param enVenta true si el producto está en venta, false de lo contrario.
     */
    public void setEnVenta(boolean enVenta) {
        this.enVenta = enVenta;
    }
}
