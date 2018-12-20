package com.kodilla.hibernate.manytomany.facade;

public class MTMProcessingException extends Exception {
    public static final String ERR_UNEXPECTED = "Unexpected error";
    public static final String ERR_NULL_FRAGMENT = "Null fragment string";

    public MTMProcessingException (String message){
        super(message);
    }
}
