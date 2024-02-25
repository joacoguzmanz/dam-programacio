package UF4.Empresa;

/**
 * Esta clase representa a un cliente que realiza encargos de productos.
 */
public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    /**
     * Crea un nuevo cliente con el nombre, dirección, número de teléfono y correo electrónico especificados.
     *
     * @param nombre    El nombre del cliente.
     * @param direccion La dirección del cliente.
     * @param telefono  El número de teléfono del cliente.
     * @param email     La dirección de correo electrónico del cliente.
     */
    public Cliente(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return La dirección del cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente.
     *
     * @param direccion La dirección del cliente.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return El número de teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param telefono El número de teléfono del cliente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la dirección de correo electrónico del cliente.
     *
     * @return La dirección de correo electrónico del cliente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece la dirección de correo electrónico del cliente.
     *
     * @param email La dirección de correo electrónico del cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Asigna un encargo al cliente para su entrega.
     *
     * @param encargo El encargo que se asignará al cliente.
     */
    public void asignarEncargo(Encargo encargo) {

    }

    /**
     * Cancela un encargo que había sido asignado al cliente.
     *
     * @param encargo El encargo que se cancelará.
     */
    public void anularEncargo(Encargo encargo) {

    }
}
