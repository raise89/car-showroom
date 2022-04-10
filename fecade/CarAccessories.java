package car_showroom.fecade;

public class CarAccessories {
    private String accessories;

    public CarAccessories(String accessories) {
        this.accessories = accessories;
    }

    public void setAccessories() {
        System.out.println("Car Accessories : "+accessories);
    }
}