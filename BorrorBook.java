// package JavaConstructors;

public class BorrorBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;
    public BorrorBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    public String getTitle() {
        return title;
    }
      public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
  
    
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    


    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public void boorow(){
        if(availability){
            availability =false;
            System.out.println("Book borrowed successfully");
        }
        else{
            System.out.println("Book is not available to borrrw");
        }
    }
    public void Bookdisplaydetails(){
        System.out.println("title:" + title);
        System.out.println("Author:" + author);
        System.out.println("price:" + price);
        System.out.println("Available: " + (availability ? "Yes" : "No"));
    }

}
