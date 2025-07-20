// package JavaConstructors;

public class HotelMain {
    public static void main(String[] args) {
        HotelBooking h1 =new HotelBooking();
        h1.displayHotelDetails();
        System.out.println("------------------");

        HotelBooking original =new HotelBooking("krishna","Ac",2);
        original.displayHotelDetails();
        System.out.println("-------------");
        HotelBooking copy = new HotelBooking(original);
        copy.displayHotelDetails();
    }
}
