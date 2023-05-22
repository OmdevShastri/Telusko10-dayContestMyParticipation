import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Product p = new Product();
//        System.out.println(p);
        ProductService service = new ProductService();

//        service.addProduct(new Product("Type C", "Cable", "Black drawer", 2022));
//        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
//        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
//        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
//        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
//        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
//        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
//        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
//        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
//        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
//        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
//        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
//        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
//        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
//        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

        List<Product> products = service.getAllProducts();
        for (Product p : products) {
            System.out.println(p);
        }
//        System.out.println("====================================");
//
//        System.out.println("getting a particular product");
//
//        Product p = service.getProduct("Type C");
//        System.out.println(p);
//        System.out.println("====================================");
//        System.out.println("a particular text");

//        List<Product> prods = service.getProductWithText("black");
//        System.out.println("Products having text");
//        prods.stream()
//                .forEach(p -> System.out.println(p));

//        List<Product> prods1 = service.getProductInaPlace("Black Table");
//        System.out.println("Products In a particular place");
//        prods1.stream()
//                .forEach(p -> System.out.println(p));

//        List<Product> prods2 = service.getProductOutWarranty(2023);
//        System.out.println("Products out of warranty");
//        prods2.stream()
//                .forEach(p -> System.out.println(p));

    }

}