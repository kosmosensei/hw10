package pro.sky.java.course1.lesson1;

public class Book {
    private final String name;
    private Author author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.name = bookName;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int year) {
        this.publishingYear = year;
    }

    public String toString() {
        return Integer.toString(publishingYear); // преобразование числа в строку.
    }

    public boolean equalsAuthor(Object other) {
        if (other.getClass() != this.getClass()) {
            return false;
        }
        Book name = (Book) other;
        return author.equals(name.author);
    }

    public int hashCode() {
        return  java.util.Objects.hash(name);
    }
}