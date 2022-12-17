package com.Skypro.Homework11;

public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public Author() {
        throw new NullPointerException("Книга должна иметь автора");
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public String getAuthorFullName() {
        return authorName + " " + authorSurname;
    }
}
