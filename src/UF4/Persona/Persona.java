package UF4.Persona;

public class Persona {

    //Fitxer Persona.java
    private String dni;
    private String nom;
    private short edat;

    public Persona(String dni, String nom, short edat) {
        this.dni = dni;
        this.nom = nom;
        this.edat = edat;
    }

    public Persona() {}

    public Persona(String dni, String nom, int edat) {
        this.dni = dni;
        this.nom = nom;
        if (edat >= 0 && edat <= Short.MAX_VALUE)
            this.edat = (short) edat;
    }

    public Persona(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }

    // Retorna: 0 si s’ha pogut canviar el dni
    // 1 si el nou dni no és correcte − No s’efectua el canvi
    public int setDni(String nouDni) {
        // Aquí hi podria haver una rutina de verificació del dni
        // i actuar en conseqüència. Com que no la incorporem, retornem sempre 0
        this.dni = nouDni;
        return 0;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Retorna: 0 si s’ha pogut canviar l’edat
    // 1 : Error per passar una edat negativa
    // 2 : Error per passar una edat "enorme"
    public int setEdat(int edat) {
        if (edat < 0) {
            return 1;
        }
        if (edat > Short.MAX_VALUE){
            return 2;
        }
        this.edat = (short) edat;
        return 0;
    }

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public short getEdat() {
        return edat;
    }

    public void visualitzar() {
        System.out.println("Dni...........:" + dni);
        System.out.println("Nom...........:" + nom);
        System.out.println("Edat..........:" + edat);
    }

}
