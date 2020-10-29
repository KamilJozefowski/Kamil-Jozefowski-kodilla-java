package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        LocalDate localDate1 = LocalDate.now();
        Library library = new Library("LibraryName1");
        Book book = new Book("to delete", "***** *** ***** ***",localDate1);
        library.books.add(book);
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.books.add(new Book("Title" + n, "Author" + n,localDate1 )));


        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Project number 2 - shallow Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library clonedLibrary1 = null;
        try {
            clonedLibrary1 = library.deepCopy();
            clonedLibrary1.setName("Project number 3 - deep Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book);

        //Then
        System.out.println(library.getName());
        library.books.forEach(n -> System.out.println("  " + n.getTitle() + " " + n.getAuthor() + " " + n.getPublicationDate()));
        System.out.println(clonedLibrary.getName());
        clonedLibrary.books.forEach(n -> System.out.println("  " + n.getTitle() + " " + n.getAuthor() + " " + n.getPublicationDate()));
        System.out.println(clonedLibrary1.getName());
        clonedLibrary1.books.forEach(n -> System.out.println("  " + n.getTitle() + " " + n.getAuthor() + " " + n.getPublicationDate()));

        assertEquals(10, library.getBooks().size());
        assertEquals(10, clonedLibrary.getBooks().size());
        assertEquals(11, clonedLibrary1.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(clonedLibrary1.getBooks(), library.getBooks());

    }
}
