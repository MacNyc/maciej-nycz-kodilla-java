package com.kodilla.spring.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class Library {
    private final List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;

    public Library(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library(){

    }

    public void saveToDb() {
        libraryDbController.saveDate();
    }

    public void loadFromDb() {
        libraryDbController.loadDate();
    }
}
