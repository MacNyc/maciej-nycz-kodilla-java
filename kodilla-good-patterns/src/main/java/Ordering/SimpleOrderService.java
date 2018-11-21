package Ordering;

import java.time.LocalDate;

public class SimpleOrderService implements OrderService {
    private static int lastId = 0;
    @Override
    public Order order(OrderRequest request) {
        return placeOrder(request);
    }

    private Order placeOrder(OrderRequest request) {
        return new Order(request, ++lastId, LocalDate.now());
    }
}
