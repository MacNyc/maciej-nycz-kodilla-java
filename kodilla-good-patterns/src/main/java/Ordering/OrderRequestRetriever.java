package Ordering;

public class OrderRequestRetriever {
    private OrderRequest request;

    public OrderRequestRetriever() {
        User user = new User(1, "MMNycz", "Maciej", "Nycz", "NN9 5TL", 8,"nycz.maciej91@gmail.com", "+447405479001");
        Product product = new Product(1, "macBookPro", 750.0);
        request = new OrderRequest(user, product, 1);
    }

    public OrderRequest retrieve() { return request; }
}