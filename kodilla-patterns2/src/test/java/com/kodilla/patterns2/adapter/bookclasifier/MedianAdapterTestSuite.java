package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){

        Set<Book> books = new HashSet<>();
        Book book1 = new Book("Author1", "Title 1", 2000, "XX1");
        Book book2 = new Book("Author2", "Title 2", 2003, "XX2");
        Book book3 = new Book("Author3", "Title 3", 2005, "XX3");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();

        int median = medianAdapter.publicationYearMedian(books);

        System.out.println(median);

        assertEquals(2003, median);


    }
}
