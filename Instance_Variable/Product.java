package Instance_Variable;

public class Product {
    // instance variable
    private String PName;
    private int duration;
    private double price;

    // class variable shared accross all the instances 
    private static String InstitutionName = "IIT Roorkee";

    public Product(String PName, int duration, double price) {
        this.PName = PName;
        this.duration = duration;
        this.price = price;
    }
// instance method
    public void displaydetailsProduct(){
        System.out.println("Course name :" + PName);
        System.out.println("Duration :" + duration);
        System.out.println("price :" + price);
        System.out.println("Institution Name :" + InstitutionName);
    }
    // ab class method banega
    public void displayINtitutionDetails(String newname){
        InstitutionName = newname;
    }
    
}
