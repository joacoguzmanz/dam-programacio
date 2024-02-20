package UF4.Agenda;

public class Agenda {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void avanzarPagina() {

    }

    public void retrocederPagina() {

    }

    public Pagina llegirPagina() {
        return new Pagina();
    }
}
