package com.Skypro.Homework11;

public class Book {

    private final Author author;
    private final String bookTitle;
    private int yearOfPublishing;

    public Book(Author author, String bookTitle, int yearOfPublishing) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getAuthor() {
        return author.getAuthorFullName();
    }
}
