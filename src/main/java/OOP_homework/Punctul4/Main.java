package OOP_homework.Punctul4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static String type = null;
    static Catalog catalog = new Catalog();
    static boolean running = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (running) {
            System.out.println("\nEnter 0 to add book to catalog." +
                    "\nEnter 1 to delete a book in the catalog." +
                    "\nEnter 2 to list all the books from the catalog.");
            int answer = scanner.nextInt();
            switch (answer) {
                case 0:
                    addbook();
                    break;

                case 1:
                    removebook();
                    break;

                case 2:
                    System.out.println(catalog.toString());
                    break;
            }
        }
    }

    private static void removebook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the book you want to delete: ");
        String name = scanner.next();

        Books books = new Books();
        catalog.removeBook(name);
    }

    private static void addbook() {
        Scanner scanner = new Scanner(System.in);
        String title, type;
        int numberOfPages;

        System.out.println("Enter title: ");
        title = scanner.next();

        System.out.println("Enter type: ");
        type = scanner.next();

        System.out.println("Enter number of pages: ");
        numberOfPages = scanner.nextInt();

//        numberOfPages = 100 + new Random().nextInt(900);

        Books books = new Books(title,type,numberOfPages);
        catalog.addBook(books);
    }
}
