package UF4.Empresa;

/**
 * Esta clase representa a un transportista que realiza entregas de productos.
 */
public class Transportista {
    private String nombre;
    private String telefono;
    private int numLicencia;

    /**
     * Crea un nuevo transportista con el nombre, teléfono y número de licencia especificados.
     *
     * @param nombre      El nombre del transportista.
     * @param telefono    El número de teléfono del transportista.
     * @param numLicencia El número de licencia del transportista.
     */
    public Transportista(String nombre, String telefono, int numLicencia) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.numLicencia = numLicencia;
    }

    /**
     * Obtiene el nombre del transportista.
     *
     * @return El nombre del transportista.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del transportista.
     *
     * @param nombre El nombre del transportista.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de teléfono del transportista.
     *
     * @return El número de teléfono del transportista.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del transportista.
     *
     * @param telefono El número de teléfono del transportista.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el número de licencia del transportista.
     *
     * @return El número de licencia del transportista.
     */
    public int getNumLicencia() {
        return numLicencia;
    }

    /**
     * Establece el número de licencia del transportista.
     *
     * @param numLicencia El número de licencia del transportista.
     */
    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    /**
     * Asigna un encargo al transportista para entregar.
     *
     * @param encargo El encargo que se asignará al transportista.
     */
    public void asignarEncargo(Encargo encargo) {

    }

    /**
     * Cancela un encargo que había sido asignado al transportista.
     *
     * @param encargo El encargo que se cancelará.
     */
    public void anularEncargo(Encargo encargo) {

    }
}
