package car_showroom.user;

public class Customer extends User{
    private String userType;

    public Customer(int id, String name, String email, String address, String userType){
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.userType = userType;
    }

    public void userInfo(){
        super.userInfo();
        System.out.println("type : "+userType);
    }
}
