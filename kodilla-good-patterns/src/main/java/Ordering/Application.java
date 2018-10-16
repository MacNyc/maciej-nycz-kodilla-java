package Ordering;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orr = new OrderRequestRetriever();
        OrderRequest request = orr.retrieve();

        OrderProcessor processor = new OrderProcessor(new SMSService(), new SimpleOrderService(), new InMemoryOrderRepository());
        OrderDto result = processor.process(request);

        System.out.println("Created order: " + result.getOrder());
    }
}