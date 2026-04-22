package task_3;

public class LibraryApp {
    public static void main(String[] args){
        // Створюємо нову бібліотеку Library
        Library library1 = new Library();

        // Створюємо книжки Book
        Book book1 = new Book("The Chronicles of Narnia", "C.S. Lewis", 1950,true);
        Book book2 = new Book("The Lord of the Rings", " John R. R. Tolkien", 1954,true);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018,true);
        Book book4 = new Book("Don Quixote", " Miguel de Cervantes", 1605,true);
        Book book5 = new Book("Mere Christianity", "C. S. Lewis", 1952,true);

        // Викликаємо метод addBook з класу Library
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);

        // Викликаємо метод borrowBook з класу Library
        library1.borrowBook("Atomic Habits");
        // Викликаємо метод returnBook з класу Library
        library1.returnBook("Atomic Habits");

        // Викликаємо метод borrowBook з класу Library
        library1.borrowBook("Mere Christianity");
        // Викликаємо метод returnBook з класу Library
        library1.returnBook("Mere Christianity");

        //Викликаємо метод listAvailableBooks з Library
        library1.listAvailableBooks();
    }
}
