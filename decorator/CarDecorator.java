package car_showroom.decorator;

public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car c){
        this.car= c;
    }

    public void type() {
        this.car.type();
    }

}