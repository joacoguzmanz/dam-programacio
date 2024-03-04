package UF4.Empresa;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una sucursal de la empresa
 */
public class Sucursal {
    private int id;
    private String nombre;
    private String direccion;
    private int telefono;
    private String email;
    private final List<Cliente> listaClientes;
    private final List<Encargo> listaEncargos;

    /**
     * Construye un nuevo objeto Sucursal con sus detalles
     *
     * @param nombre    El nombre de la sucursal
     * @param direccion La dirección de la sucursal
     * @param telefono  El número de teléfono de la sucursal
     * @param email     La dirección de email de la sucursal
     */
    public Sucursal(int id, String nombre, String direccion, int telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.listaClientes = new ArrayList<>();
        this.listaEncargos = new ArrayList<>();
    }

    /**
     * Retorna la lista de clientes
     *
     * @return List de clientes
     */
    public List<Cliente> getListaClientes() {
        return listaClientes;
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
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono de la sucursal
     *
     * @param telefono El número de teléfono de la sucursal
     */
    public void setTelefono(int telefono) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        listaClientes.add(cliente);
        System.out.println("¡Cliente dado de alta!");
    }

    /**
     * Da de baja a un cliente
     *
     * @param cliente El cliente a dar de baja
     */
    public void bajaCliente(Cliente cliente) {
        listaClientes.remove(cliente);
        System.out.println("¡Cliente dado de baja!");
    }

    /**
     * Registra un nuevo encargo hecho por un cliente con un transportista
     *
     * @param cliente       El cliente que hace el encargo
     * @param transportista El transportista asignado al encargo
     * @param encargo       El encargo que se crea
     */
    public void altaEncargo(Cliente cliente, Transportista transportista, Encargo encargo) {
        listaEncargos.add(encargo);
        System.out.println("¡Encargo agregado a la sucursal!");
    }

    /**
     * Anula un encargo existente
     *
     * @param encargo El encargo a cancelar
     */
    public void anularEncargo(Encargo encargo) {
        listaEncargos.remove(encargo);
        System.out.println("¡Encargo anulado de la sucursal!");
    }

    public void mostrarClientes() {
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.getNombre());
        }
    }

    public void mostrarEncargos() {
        for (Encargo encargo : listaEncargos) {
            System.out.println("Encargo Nº" + encargo.getId());
            encargo.mostrarPeticiones();
        }
    }

    public void mostrarDatos() {
        System.out.println("ID: " + this.getId());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Telefono: " + this.getTelefono());
        System.out.println("Email: " + this.getEmail());
    }
}
