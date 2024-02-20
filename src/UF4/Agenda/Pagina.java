package UF4.Agenda;

import java.util.ArrayList;
import java.util.List;

public class Pagina {
    private int day;
    private int month;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void afegirCita(Cita nombre) {

    }

    public void borrarCita(Cita nombre) {

    }

    public Cita cercarCita(String title) {
        return new Cita();
    }

    public List<Cita> llistarCites() {
        return new ArrayList<>();
    }
}
