package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Анджей", "Сапковский");
        Book book1 = new Book("Ведьмак", author1, 1985);
        book1.setPublishingYear(1986);
        System.out.println("Книга: " + book1.getName()); // Вывод с своим коментом.
        System.out.println("Автор: " + author1);
        System.out.println("Год издания: " + book1.getPublishingYear());

        System.out.println(" ");

        Author author2 = new Author("Джон", "Рональд Руэл Толкин");
        Book book2 = new Book("Властелин колец", author2, 1954);
        book2.setPublishingYear(1955);
        System.out.println("book2.getBookName() = " + book2.getName());
        System.out.println("author2.getName() = " + author2);
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());

        System.out.println(" ");
        System.out.println("book1.toString().equals(book2) = " + book1.toString().equals(book2.toString()));
        System.out.println(" ");

        System.out.println("Авторы книг один и тот же? - " + book1.equalsAuthor(book2)); // equals в методе Book
        System.out.println("author1.equalsAuthor(author2) = " + author1.equals(author2)); // Имя автора первой книги в стравнении с именем во второй книге. Класс Author

        System.out.println(" ");

        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("author2.hashCode() = " + author2.hashCode());
    }
}
