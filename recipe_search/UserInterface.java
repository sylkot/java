
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private CookBook cookBook;
    private ReadRecepieFile reader;
    private Scanner scan;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.cookBook = new CookBook();
        this.reader = new ReadRecepieFile();
    }

    public void start() {
        readInCookBook();
        commands();

    }

    public void readInCookBook() {
        System.out.println("File to read:");
        String fileName = scan.nextLine();
        ArrayList<ArrayList> recipes = reader.readRecipeFile(fileName);
        this.cookBook.createCookBook(recipes);
    }

    public void commands() {
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while (true) {
            System.out.println("Enter command:");
            String command = scan.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                listRecepies();
                System.out.println("");
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String name = scan.nextLine();
                System.out.println("Recipes:");
                searchRecepieByName(name);
                System.out.println("");
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxTime = Integer.valueOf(scan.nextLine());
                System.out.println("Recipes:");
                searchRecepieByTime(maxTime);
                System.out.println("");
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scan.nextLine();
                System.out.println("Recipes:");
                searchRecepieByIngredient(ingredient);
                System.out.println("");
            }
        }
    }

    public void listRecepies() {
        this.cookBook.printRecepiesDetails();
    }

    public void searchRecepieByName(String name) {
        this.cookBook.listRecepiesKeyName(name);
    }

    public void searchRecepieByTime(int maxTime) {
        this.cookBook.listRecepiesKeyTime(maxTime);
    }

    public void searchRecepieByIngredient(String ingredient) {
        this.cookBook.listRecepiesKeyIngredient(ingredient);
    }

}
