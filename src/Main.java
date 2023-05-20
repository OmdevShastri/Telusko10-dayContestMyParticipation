import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Product p = new Product();
//        System.out.println(p);
        ProductService service = new ProductService();

        service.addProduct(new Product("Type C", "Cable", "Black drawer", 2022));


        List<Product> products = service.getAllProducts();
//        for (Product p : products) {
//            System.out.println(p);
//        }
//        System.out.println("====================================");
//
//        System.out.println("getting a particular product");
//
//        Product p = service.getProduct("Type C");
//        System.out.println(p);
//        System.out.println("====================================");
//        System.out.println("a particular text");

        List<Product> prods = service.getProductWithText("black");
        for (Product product : prods) {
            System.out.println(product);
        }
    }

}