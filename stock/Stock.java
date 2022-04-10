package car_showroom.stock;
import car_showroom.fecade.*;

public class Stock {
    private String model, year, engine, color, accessories;
    private boolean hasStock = true;
    public Stock(String model, String year, String engine,String color,String accessories){
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.color = color;
        this.accessories = accessories;
    }
    public void show(){
        if (hasStock){
            Built blt = new Built(engine, color, accessories);
            System.out.println(model);
            System.out.println(year);
            blt.BuiltInfo();
        }
    }
}
