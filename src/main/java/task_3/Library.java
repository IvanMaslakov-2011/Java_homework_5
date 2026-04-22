package task_3;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();


    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book currentBook = books.get(i);

            if (currentBook.getTitle().equals(title)) {

                if (currentBook.getAvailable()) {
                    currentBook.setAvailable(false);
                } else {
                    System.out.println("Вибачте книга недоступна!");
                }
                return;
            }
        }
        System.out.println("Вибачте, але книги " + title + " не має у нашій бібліотеці!");
    }

    public void returnBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book currentBook = books.get(i);

            if (currentBook.getTitle().equals(title)) {
                if (!currentBook.getAvailable()) {
                    currentBook.setAvailable(true);
                } else {
                    System.out.println("Ця книга на місці!");
                }
                return;
            }
        }
        System.out.println("Вибачте, але книги " + title + " не має у нашій бібліотеці!");
    }

    public void listAvailableBooks() {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getAvailable()) {
                System.out.println((i + 1) + ". Книга: " + books.get(i).getTitle());
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book currentBook = books.get(i);

            if (currentBook.getTitle().equals(title)) {
                return currentBook;
            }
        }
        System.out.println("Вибачте, але книги " + title + " не знайдено!");

        return null;
    }
}

