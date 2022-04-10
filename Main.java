package car_showroom;
import car_showroom.decorator.*;
import car_showroom.payment.*;
import car_showroom.stock.*;
import car_showroom.user.*;


public class Main {
    public static void main(String []args){
        Stock stk = new Stock("X5","2022","450HP", "Metalic Silver", "Extra Tyre");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        Customer ur = new Customer(4, "abc", "abc@gmail.com", "london", "customer");
        Employee emp = new Employee(5, "ad", "ad@gmail.com", "london", "type", "yes");

        if(emp.availableCar() == true){
            Payment pmt = new Payment(123456789, "2022");
            System.out.println("\n***************\n");
            stk.show();
            System.out.println("\n***************\n");
            sportsLuxuryCar.type();
            System.out.println("\n\n***************\n");
            ur.userInfo();
            System.out.println("\n***************\n");
        }
    }
}
