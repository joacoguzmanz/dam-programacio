package UF4.Persona;

public class Estudiante extends Persona {
    private String curs;
    private String assignatura;
    private String escola;
    private int nota;

    public Estudiante(String dni, String nom, int nota) {
        super(dni, nom);
        this.nota = nota;
    }

    public Estudiante(String curs, String assignatura, String escola, int nota) {
        this.curs = curs;
        this.assignatura = assignatura;
        this.escola = escola;
        this.nota = nota;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public String getAssignatura() {
        return assignatura;
    }

    public void setAssignatura(String assignatura) {
        this.assignatura = assignatura;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
