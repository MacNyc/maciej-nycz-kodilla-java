package Ordering;

public class Application {
    public static void main(String[] args) {
        User user = new User(2,"MMNycz","Maciej","Nycz", "NN95TL", 8, "nycz.maciej91@gmail.com", "07405479001");
        Product product = new Product(3, "MacBook", 750.0);
        int[] quntity = new int[3];

        ProductOrderService productOrderService = new ProductOrderService(user,product,quntity);


        System.out.println("Created order: " + productOrderService);
    }
}