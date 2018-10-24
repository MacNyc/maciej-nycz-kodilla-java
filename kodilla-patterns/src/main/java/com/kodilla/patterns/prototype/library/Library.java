package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library {
    public String name;
    public Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for (Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        for (Book theBook : books) {
            Book clonedList = new Book(theBook.getTitle(), theBook.getAuthor(), theBook.getPublicationDay());
            clonedLibrary.getBooks().add(clonedList);
        }
        return clonedLibrary;
    }
}