package com.Skypro.Homework11;

public class BookShelf {

    public static void main(String[] args) {
        Author author1 = new Author("Василий", "Маханенко");
        Book book1 = new Book(author1, "Путь Шамана", 2008);

        Author author2 = new Author("Андрей", "Сапковский");
        Book book2 = new Book(author2, "Ведьмак", 1993);

        //book1.setYearOfPublishing(1598);
        //book2.setYearOfPublishing(2000);

        System.out.println(book1.getAuthor() + " " + book1.getBookTitle() + " " + book1.getYearOfPublishing());
        System.out.println(book2.getAuthor() + " " + book2.getBookTitle() + " " + book2.getYearOfPublishing());


    }

}
