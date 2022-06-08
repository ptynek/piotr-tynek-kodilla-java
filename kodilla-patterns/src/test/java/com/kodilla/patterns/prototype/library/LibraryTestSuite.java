package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;


public class LibraryTestSuite {

    @Test
    void testGetBooks(){

        Library booksList = new Library("Lista książek");

        Book book1 = new Book("Title 1", "Author 1", LocalDate.parse("2020-01-02"));
        Book book2 = new Book("Title 2", "Author 2", LocalDate.parse("1993-02-02"));
        Book book3 = new Book("Title 3", "Author 3", LocalDate.parse("1982-01-02"));

        booksList.getBooks().add(book1);
        booksList.getBooks().add(book2);
        booksList.getBooks().add(book3);

        Library clonedLibrary = null;
        try{
            clonedLibrary = booksList.shallowCopy();
            clonedLibrary.setName("Lista książek 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = booksList.deepCopy();
            deepClonedLibrary.setName("Lista książek 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        booksList.getBooks().remove(book3);

        System.out.println(booksList);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        assertEquals(2, booksList.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(booksList.getBooks(), clonedLibrary.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), booksList.getBooks());
    }
}
