package car_showroom.user;

public class User {
    protected int id;
    protected String name, email, address;

    public void userInfo(){
        System.out.println("name : "+name);
        System.out.println("email : "+email);
        System.out.println("address : "+address);
    }
}
