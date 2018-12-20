package com.kodilla.patterns2a2.facade.api;

public class OrderProcessingException extends Exception {

    public static String ERR_NOT_AUTHORISED = "User is not authorised";
    public static String ERR_PAYMENT_REJECTED = "Payment was rejected";
    public static String ERR_VERIFICATION_ERROR = "Verification error";
    public static String ERR_SUBMITING_ERROR = "Can not submit order";

    public OrderProcessingException (String message){
        super(message);
    }
}
