package search;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(205, "T-shirt", "Clothing"),
            new Product(123, "Mobile", "Electronics"),
            new Product(305, "Laptop", "Electronics")
        };

       
        Product result1 = ProductSearch.linearSearch(products, 123);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not found"));

        
        Product result2 = ProductSearch.binarySearch(products, 123);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not found"));
    }
}
