package car_showroom.fecade;

public class Built {
    protected static CarEngine engine;
    protected static CarColor color;
    protected static CarAccessories accessories;

    public Built(String engine,String color,String accessories){
        this.engine = new CarEngine(engine);
        this.color = new CarColor(color);
        this.accessories = new CarAccessories(accessories);
    }

    public static void BuiltInfo(){
        engine.setEngine();
        color.setColor();
        accessories.setAccessories();
    }
}
