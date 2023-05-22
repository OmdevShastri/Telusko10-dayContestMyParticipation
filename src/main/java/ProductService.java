import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ProductService {
    List<Product> products = new ArrayList<>();
    ProductDB db = new ProductDB();

    public void addProduct(Product p ){
        //products.add(p);
        db.save(p);
    }
    public List<Product> getAllProducts(){
        //return products;
        return db.getAll();
    }
    public Product getProduct(String name){
        for (Product p :
                products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();
//        for (Product p :
//                products) {
//            String name = p.getName().toLowerCase();
//            String type = p.getType().toLowerCase();
//            String place = p.getPlace().toLowerCase();
//            if (name.contains(str) || type.contains(str) || place.contains(str)){
//                prods.add(p);
//            }
//        }
        products.stream()
                .filter(p -> p.getPlace().toLowerCase().contains(str) || p.getName().toLowerCase().contains(str) || p.getType().toLowerCase().contains(str))
                .forEach(p -> prods.add(p));
        return  prods;

    }

    public List<Product> getProductInaPlace(String placeT) {
        String str = placeT.toLowerCase();
        List<Product> prods = new ArrayList<>();
//        for (Product p :
//                products) {
//            String place = p.getPlace().toLowerCase();
//            if (place.contains(str)){
//                prods.add(p);
//            }
//        }
//        return prods;
        products.stream()
                .filter(p -> p.getPlace().toLowerCase().contains(str))
                .forEach(p -> prods.add(p));
        return  prods;
    }

    public List<Product> getProductOutWarranty(int warr) {
        List<Product> prods = new ArrayList<>();
//        for (Product p :
//                products) {
//            if (warr == p.getWarranty() || warr> p.getWarranty()){
//                prods.add(p);
//            }
//        }
        //return prods;

        products.stream()
                .filter(p -> p.getWarranty()<=warr)
                .forEach(p -> prods.add(p));
        return  prods;
    }
}
