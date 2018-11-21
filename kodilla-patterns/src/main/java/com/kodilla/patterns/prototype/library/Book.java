package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

public final class Book {
    public String title;
    public String author;
    public LocalDate publicationDay;

    public Book(final String title, final String author, final LocalDate publicationDay) {
        this.title = title;
        this.author = author;
        this.publicationDay = publicationDay;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDay() {
        return publicationDay;
    }

    @Override
    public String toString() {
        return "Book:" + "\nTitle: "+ title + "\nAuthor: " + author + "\npublication day: " + publicationDay;
    }
}

