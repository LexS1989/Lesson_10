package skypro.ru;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг");
        Author author2 = new Author("Анджей", "Сапковский");
        System.out.println(author1);
        System.out.println(author2);

        Book book1 = new Book("Темная башня", author1, 1982);
        Book book2 = new Book("Ведьмак", author2, 1986);
        System.out.println(book1);
        System.out.println(book2);

        book1.setYearPublishing(2003);
        System.out.println(book1);

        Author author3 = new Author("Стивен", "Кинг");
        String author4 = "Стивен Кинг";
        System.out.println("author1.equals(author2) = " + author1.equals(author2));
        System.out.println("author1.equals(author3) = " + author1.equals(author3));
        System.out.println("author1.equals(author4) = " + author1.equals(author4));

        Book book3 = new Book("Ведьмак", author2, 1986);
        System.out.println("book1.equals(book2) = " + book1.equals(book2));
        System.out.println("book2.equals(book3) = " + book2.equals(book3));

        System.out.println("Objects.hash(author1) = " + Objects.hash(author1));
        System.out.println("Objects.hash(author2) = " + Objects.hash(author2));
        System.out.println("Objects.hash(author3) = " + Objects.hash(author3));
        System.out.println("Objects.hash(book1) = " + Objects.hash(book1));
        System.out.println("Objects.hash(book2) = " + Objects.hash(book2));
        System.out.println("Objects.hash(book3) = " + Objects.hash(book3));
    }
}
