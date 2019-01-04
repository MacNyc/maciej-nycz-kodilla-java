package com.kodilla.patterns2a2.adapter.bookclasifier;

import com.kodilla.patterns2a2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2a2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2a2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2a2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    private BookStatistics statistics = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return statistics.medianPublicationYear(books);
    }
}
