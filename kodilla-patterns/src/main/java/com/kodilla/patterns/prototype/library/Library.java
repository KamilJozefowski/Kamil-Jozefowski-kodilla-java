package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {
    private final String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {

    }

    public void setBooks(Set<Book> bookList) {
        this.books = bookList;
    }


    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library cloneLibrary = super.clone();
        cloneLibrary.books = new HashSet<>();
        for (Book book : books){
            Book cloneBook = new Book(book.getTitle(),book.getAuthor(),book.getPublicationDate());
            cloneLibrary.getBooks().add(cloneBook);
        }
        return cloneLibrary;
    }
}