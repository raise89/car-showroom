package car_showroom.payment;

public class Payment {
    private int cardNo;
    private String date;
    public Payment(int cardNo, String date){
        this.cardNo = cardNo;
        this.date = date;
    }
    public void paymentInfo(){
        System.out.println("payment : successfull");
        System.out.println("date : "+date);
    }
}
