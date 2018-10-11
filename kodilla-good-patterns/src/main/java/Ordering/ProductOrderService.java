package Ordering;

public class ProductOrderService {
    public boolean order(final User user, final Product product, final int quantity){
        System.out.println("Creating orders for" + user.getNickName() + "\nItem: " + product.getName() +
                "\nQuantity: "+ quantity);

        OrderRepository orderRepository = new OrderRepository();
        orderRepository.createOrder(user, product, quantity);
        return true;
    }

}