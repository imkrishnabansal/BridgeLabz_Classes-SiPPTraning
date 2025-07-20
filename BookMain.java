// package JavaConstructors;

public class BookMain {
    public static void main(String[] args) {
        BorrorBook b1 = new BorrorBook("Do epic shit done", "Ankur Wariko", 258.0, true);
        b1.Bookdisplaydetails();
        b1.boorow();
        b1.boorow(); //borrow again check krne ke lie ki borrow hui h ya nhi 
       
        System.out.println("---------------");
    }
}
