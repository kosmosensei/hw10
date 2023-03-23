package pro.sky.java.course1.lesson1;

public class Book {
    private final String bookName;
    private final Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.authorName = authorName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public void setPublishingYear(int year) {
        this.publishingYear = year;
    }
}
