
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                System.out.println(books.size() + " books in total.");
                break;
            }
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, age);
            books.add(book);
        }
        
        Comparator<Book> comp = Comparator.comparing(Book::getAge).thenComparing(Book::getName);
        
        books.stream().sorted(comp).forEach(book -> System.out.println(book));
        
    }

}
