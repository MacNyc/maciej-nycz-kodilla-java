package Ordering;

public class OrderProcessor {
    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepoository){

        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepoository;
    }

    public OrderDto process(final OrderRequest request) {

        Order order = orderService.order(request);
        if (order == null) { return null; }
        return new OrderDto(order, informationService.inform(order),
                orderRepository.createOrder(order));
    }
}
