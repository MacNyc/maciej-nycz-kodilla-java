package com.kodilla.patterns2a2.adapter.bookclasifier;

import com.kodilla.patterns2a2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2a2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2a2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> booksOfTypeA) {
        if (booksOfTypeA == null || booksOfTypeA.isEmpty()) {
            throw new IllegalArgumentException("The set is null or empty");
        }
        return medianPublicationYear(booksOfTypeA.stream()
                .collect(Collectors.toMap(MedianAdapter::toSignature, MedianAdapter::libraryAtoB)));
    }

    private static com.kodilla.patterns2a2.adapter.bookclasifier.libraryb.Book libraryAtoB(Book book) {
        return new com.kodilla.patterns2a2.adapter.bookclasifier.libraryb.Book(
                book.getAuthor(), book.getTitle(), book.getPublicationYear());
    }

    private static BookSignature toSignature(Book book) {
        return new BookSignature(book.getSignature());
    }
}