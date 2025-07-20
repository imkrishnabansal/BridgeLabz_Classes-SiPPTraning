// package JavaConstructors;
public class pBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayDetails();

        System.out.println("---------");

        Book b2 = new Book("The Alchemist", "Paulo Coelho", 499.99);
        b2.displayDetails();
    }
}
