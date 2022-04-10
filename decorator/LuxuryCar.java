package car_showroom.decorator;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car c) {
        super(c);
    }

    public void type(){
        super.type();
        System.out.print("Luxury Car > ");
    }
}
