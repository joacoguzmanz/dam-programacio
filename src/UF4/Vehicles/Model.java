package UF4.Vehicles;

public class Model extends Brand {
    private String colour;
    private int km;

    public Model(String colour, int km) {
        this.colour = colour;
        this.km = km;
    }

    public Model(String brandName, String colour, int km) {
        super(brandName);
        this.colour = colour;
        this.km = km;
    }

    public Model(int id, String brandName, String colour, int km) {
        super(id, brandName);
        this.colour = colour;
        this.km = km;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
