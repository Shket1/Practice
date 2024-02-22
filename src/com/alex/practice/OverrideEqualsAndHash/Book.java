package com.alex.practice.OverrideEqualsAndHash;

import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private int pagesNumber;

    public Book(String author, String title, int pagesNumber) {
        this.author = author;
        this.title = title;
        this.pagesNumber = pagesNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Book otherBook = (Book) obj;

        return Objects.equals(title, otherBook.title) &&
                Objects.equals(author, otherBook.author) &&
                pagesNumber == otherBook.pagesNumber;
    }

   /* @Override
    public int hashCode() {
        return Objects.hash(title, author, pagesNumber);
    }
    */


    @Override
    public int hashCode() {
        int hash = 19;
        if (title != null) {
            hash = hash + title.hashCode();
        }
        hash *= 3;
        if (author != null) {
            hash = hash + author.hashCode();
        }
        hash *= 3;
        hash = hash + pagesNumber;
        hash *= 7;
        return hash;
    }

    @Override
    public String toString() {
        return "Book { " +
                "title = '" + title + "'" +
                ", author = '" + author + "'" +
                ", pagesNumber = '" + pagesNumber + "'" +
                "}";
    }
}
