package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Анджей", "Сапковский");
        Book book1 = new Book("Ведьмак", author1, 1985);
        book1.setPublishingYear(1986);
        System.out.println("Книга: " + book1.getBookName()); // Вывод с своим коментом.
        System.out.println("Автор: " + author1.getFirstName() + " " + author1.getLastName());
        System.out.println("Год издания: " + book1.getPublishingYear());

        System.out.println(" ");

        Author author2 = new Author("Джон", "Рональд Руэл Толкин");
        Book book2 = new Book("Властелин колец", author2, 1954);
        book2.setPublishingYear(1955);
        System.out.println("book2.getBookName() = " + book2.getBookName()); // Вывод с коментом через soutv
        System.out.println("author2.getName() = " + author2.getFirstName() + " " + author2.getLastName());
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());
    }
}
