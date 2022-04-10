package car_showroom.decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);
    }

    public void type(){
        super.type();
        System.out.print("Sports Car > ");
    }
}