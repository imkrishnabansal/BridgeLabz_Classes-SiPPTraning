// package JavaConstructors;

public class Carrental {
    private String cname;
    private String carmodel;
    private double rentaldays;
    private double rentPerDay;
    // private boolean availabilty;

    public Carrental(String cname, String carmodel, double rentaldays, double rentPerDay) {
        this.cname = cname;
        this.carmodel = carmodel;
        this.rentaldays = rentaldays;
        this.rentPerDay = rentPerDay;
        // this.availabilty =true;
    }

  
    public double CalculateCost(){
        return rentPerDay*rentaldays; 
       
}
public void DispalyCardetails(){
    System.out.println("Customername :" + cname);
    System.out.println("CarModel :" + carmodel);
    System.out.println("RentalDays :" + rentaldays);
    System.out.println("RentPerDay :" + rentPerDay);
    // System.out.println("Available" + (availabilty ? "Yes":"NO"));
}
}