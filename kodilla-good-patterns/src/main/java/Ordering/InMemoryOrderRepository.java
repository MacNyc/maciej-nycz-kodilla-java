package Ordering;

public class InMemoryOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(Order order) {
        return true;
    }
}