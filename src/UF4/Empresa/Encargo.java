package UF4.Empresa;

import java.util.List;
import java.util.ArrayList;

/**
 * Esta clase representa un encargo para la entrega de productos en una fecha y hora.
 */
public class Encargo {
    private int id;
    private int dia;
    private int mes;
    private int hora;
    private int minutos;
    private final List<Peticion> listaPeticiones;

    /**
     * Crea un nuevo encargo con fecha y hora.
     *
     * @param dia     El día del encargo.
     * @param mes     El mes del encargo.
     * @param hora    La hora del encargo.
     * @param minutos Los minutos del encargo.
     */
    public Encargo(int id, int dia, int mes, int hora, int minutos) {
        this.id = id;
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.minutos = minutos;
        this.listaPeticiones = new ArrayList<>();
    }

    /**
     * Obtiene el día del encargo.
     *
     * @return El día del encargo.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Establece el día del encargo.
     *
     * @param dia El día del encargo.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Obtiene el mes del encargo.
     *
     * @return El mes del encargo.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Establece el mes del encargo.
     *
     * @param mes El mes del encargo.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Obtiene la hora del encargo.
     *
     * @return La hora del encargo.
     */
    public int getHora() {
        return hora;
    }

    /**
     * Establece la hora del encargo.
     *
     * @param hora La hora del encargo.
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Obtiene los minutos del encargo.
     *
     * @return Los minutos del encargo.
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Establece los minutos del encargo.
     *
     * @param minutos Los minutos del encargo.
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Agrega un producto a este encargo.
     *
     * @param peticion La petición que contiene el producto a agregar.
     */
    public void agregarProducto(Peticion peticion) {
        listaPeticiones.add(peticion);
        System.out.println("¡Petición agregada!");
    }

    /**
     * Elimina un producto de este encargo.
     *
     * @param peticion La petición que contiene el producto a eliminar.
     */
    public void eliminarProducto(Peticion peticion) {
        listaPeticiones.remove(peticion);
        System.out.println("¡Petición removida!");
    }

    public void mostrarPeticiones() {
        for (Peticion peticion : listaPeticiones) {
            System.out.println(peticion.getProducto() + " " + peticion.getCantidad());
        }
    }
}
