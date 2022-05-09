package skypro.ru;

import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int yearPublishing;

    public Book(String bookName, Author author, int yearPublishing) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return "Название книги: " + bookName + " / " + author + " / " + "Год публикации: " + yearPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearPublishing);
    }
}


