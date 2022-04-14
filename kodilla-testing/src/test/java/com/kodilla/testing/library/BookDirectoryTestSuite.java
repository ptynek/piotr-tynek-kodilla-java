package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        List<Book> theListOfBooks = bookLibrary.listBooksWitCondition("Secret");

        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        List<Book> theListOfBooks0 = bookLibrary.listBooksWitCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWitCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWitCondition("FortyBooks");

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> theListOfBooks10 = bookLibrary.listBooksWitCondition("An");

        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();

        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testBorrowedBooks() {
        LibraryUser libraryUser1 = new LibraryUser("Piotr", "Nowak", "1234567890");
        LibraryUser libraryUser2 = new LibraryUser("Kamil", "Kowalski", "0987654321");
        LibraryUser libraryUser3 = new LibraryUser("Jakub", "Kubica", "3214567890");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> zeroBorrowedBooks = new ArrayList<>();
        List<Book> oneBorrowedBooks = generateListOfNBooks(1);
        List<Book> fiveBorrowedBooks = generateListOfNBooks(5);
        HashMap<LibraryUser, ArrayList<Book>> listNr1 = new HashMap<>();
        HashMap<LibraryUser, ArrayList<Book>> listNr2 = new HashMap<>();
        HashMap<LibraryUser, ArrayList<Book>> listNr3 = new HashMap<>();
        listNr1.put(libraryUser1, (ArrayList<Book>) zeroBorrowedBooks);
        listNr2.put(libraryUser2, (ArrayList<Book>) oneBorrowedBooks);
        listNr3.put(libraryUser3, (ArrayList<Book>) fiveBorrowedBooks);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(zeroBorrowedBooks);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2)).thenReturn(oneBorrowedBooks);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3)).thenReturn(fiveBorrowedBooks);

        List<Book> listOfBooks0 = bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> listOfBooks1 = bookLibrary.listBooksInHandsOf(libraryUser2);
        List<Book> listOfBooks5 = bookLibrary.listBooksInHandsOf(libraryUser3);

        assertEquals(0, listOfBooks0.size());
        assertEquals(1, listOfBooks1.size());
        assertEquals(5, listOfBooks5.size());

    }
}
