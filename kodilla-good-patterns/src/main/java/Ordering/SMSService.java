package Ordering;

public class SMSService implements InformationService {
    @Override
    public boolean inform(Order order) {
        User user = order.getUser();
        String phone = user.getPhoneNumber();
        return true;
    }
}
