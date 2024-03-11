package UF4.Vehicles;

public class Car {
    private int id;

    public Car() {

    }

    public Car(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void vehicleType() {
        System.out.println("Vehicle type");
    }
}
