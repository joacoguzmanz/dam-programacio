package UF4.Empresa;

/**
 * Representa una sucursal de la empresa
 */
public class Sucursal {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    /**
     * Construye un nuevo objeto Sucursal con sus detalles
     *
     * @param nombre    El nombre de la sucursal
     * @param direccion La dirección de la sucursal
     * @param telefono  El número de teléfono de la sucursal
     * @param email     La dirección de email de la sucursal
     */
    public Sucursal(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Obtiene el nombre de la sucursal
     *
     * @return El nombre de la sucursal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la sucursal
     *
     * @param nombre El nombre de la sucursal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección de la sucursal
     *
     * @return La dirección de la sucursal
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece el nombre de la dirección
     *
     * @param direccion La dirección de la sucursal
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el número de teléfono de la sucursal
     *
     * @return El número de teléfono de la sucursal
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono de la sucursal
     *
     * @param telefono El número de teléfono de la sucursal
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la dirección de email de la sucursal
     *
     * @return La dirección de email de la sucursal
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el nombre de email de la sucursal
     *
     * @param email El nombre de email de la sucursal
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Permite descansar al transportista
     *
     * @param transportista El transportista que va a descansar
     */
    public void descansa(Transportista transportista) {

    }

    /**
     * Permite trabajar al transportista
     *
     * @param transportista El transportista que va a trabajar
     */
    public void trabaja(Transportista transportista) {

    }

    /**
     * Registra un nuevo cliente
     *
     * @param cliente El cliente a registrar
     */
    public void altaCliente(Cliente cliente) {

    }

    /**
     * Da de baja a un cliente
     *
     * @param cliente El cliente a dar de baja
     */
    public void bajaCliente(Cliente cliente) {

    }

    /**
     * Registra un nuevo encargo hecho por un cliente con un transportista
     *
     * @param cliente       El cliente que hace el encargo
     * @param transportista El transportista asignado al encargo
     * @param encargo       El encargo que se crea
     */
    public void altaEncargo(Cliente cliente, Transportista transportista, Encargo encargo) {

    }

    /**
     * Anula un encargo existente
     *
     * @param encargo El encargo a cancelar
     */
    public void anularEncargo(Encargo encargo) {

    }
}
