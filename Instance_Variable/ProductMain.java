package Instance_Variable;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("B.tech" ,3,500000);
        p1.displaydetailsProduct();
        System.out.println("---------------");
        p1.displayINtitutionDetails("GLA university");
        p1.displaydetailsProduct();
    }
}
