package com.kodilla.patterns2a2.adapter.bookclassifier;

import com.kodilla.patterns2a2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2a2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedianOneBook() {
        // Given
        Set<Book> bookOfTypeA = new HashSet<>();
        bookOfTypeA.add(new Book("J.K.Rowling", "Harry Potter and the Philosopher's Stone", 2001, "Signature 1"));

        // When
        int median = new MedianAdapter().publicationYearMedian(bookOfTypeA);
        System.out.println(median);

        // Then
        assertEquals(2001, median);
    }
}

