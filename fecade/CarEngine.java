package car_showroom.fecade;

public class CarEngine {
    private String engine;

    public CarEngine(String engine) {
        this.engine = engine;
    }

    public void setEngine(){
        System.out.println("Car engine : "+engine);
    }
}
