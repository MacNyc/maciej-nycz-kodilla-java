package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        //Creative my personal books list
        Set<Book> fernMoorDriveLibraryBooks = new HashSet<>();
        fernMoorDriveLibraryBooks.add(new Book("Java Podstawy - Wydanie X", "Cay S. Horstmann", LocalDate.of(2016, 12, 15)));
        fernMoorDriveLibraryBooks.add(new Book("Secrets of Alamo", "John Smith", LocalDate.of(2008, 12, 01)));
        fernMoorDriveLibraryBooks.add(new Book("Secretaries and Directors", "Dilbert Michigan", LocalDate.of(2012, 01, 22)));

        //Creating my home library
        Library library = new Library("Nycz's library");
        library.getBooks().addAll(fernMoorDriveLibraryBooks);

        //Making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("NYCZ");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //Making a deep clone of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("MACIEJ");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(fernMoorDriveLibraryBooks);


        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}
