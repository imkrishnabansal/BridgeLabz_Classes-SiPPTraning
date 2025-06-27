package Level1;

public class MovieTIcket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTIcket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
}
}
