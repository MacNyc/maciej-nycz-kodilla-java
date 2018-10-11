package Ordering;

public interface MailService {
    default boolean inform(Order order) {
        User user = order.getUser();
        String email = user.getEmail();

        return true;
    }
}

