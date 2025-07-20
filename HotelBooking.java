// package JavaConstructors;

public class HotelBooking {
    private String guestname;
    private String roomType;
    private int nights;

    public HotelBooking(){
        defaultHotelConstructor();
    }
    public HotelBooking(String guestname, String roomType, int nights) {
        this.guestname = guestname;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking other){
        this.guestname = other.guestname;
        this.roomType = other.roomType;
        this.nights = other.nights;

    }

    public String getGuestname() {
        return guestname;
    }
    public void setGuestname(String guestname) {
        this.guestname = guestname;
    }
    
    public String getRoomType() {
        return roomType;
    }
    
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }
    public void setNights(int nights) {
        this.nights = nights;
    }

    public void defaultHotelConstructor(){
        this.guestname = "error";
        this.nights = 0;
        this.roomType = "Nothing";

    }
     public void displayHotelDetails(){
        System.out.println("guesName:" +  guestname);
        System.out.println("Roomtype:" + roomType);
        System.out.println("Nights:" + nights);


     }


}
