package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

@Repository
public class LibraryDbController {
    public void saveDate(){
        System.out.println("Saving data to the database.");
    }

    public void loadDate(){
        System.out.println("Loading data from the database.");
    }
}
