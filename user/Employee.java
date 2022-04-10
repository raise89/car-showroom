package car_showroom.user;

public class Employee extends User{
    private String userType, available;

    public Employee(int id, String name, String email, String address, String userType, String available){
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.userType = userType;
        this.available = available;
    }

    public void userInfo(){
        super.userInfo();
        System.out.println("type : "+userType);
    }
    public boolean availableCar(){
        if(available == "yes"){
            return true;
        }else{
            return false;
        }
    }

}
