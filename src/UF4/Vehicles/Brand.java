package UF4.Vehicles;

public class Brand extends Car {
    private String brandName;

    public Brand() {

    }

    public Brand(String brandName) {
        this.brandName = brandName;
    }

    public Brand(int id, String brandName) {
        super(id);
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void brand() {
        System.out.println("Brand is " + this.brandName);
    }

    public void speed() {
        System.out.println("Speed is ...");
    }
}
