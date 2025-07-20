package AcessModefier;

public class studentMain {
    public static void main(String[] args) {

        Postgraduate pg = new Postgraduate(45, "Krishna", 8, "Cs");  // Semicolon added

        pg.display();

        System.out.println("----------");

        // Modify CGPA using setter method
        pg.setCgpa(9);
        pg.display();
    }
}
