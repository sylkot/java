
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private BirdAtlas birdAtlas;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.birdAtlas = new BirdAtlas();
    }

    public void start() {
        commands();

    }

    public void commands() {
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scan.nextLine();
                add(name, latinName);
            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                observation(name);
            } else if (command.equals("All")) {
                printAll();
            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                printOneBird(name);
            }
        }

    }

    public void add(String name, String latinName) {
        this.birdAtlas.addBirdToAtlas(name, latinName);
    }

    public void observation(String name) {
            if (this.birdAtlas.isItObservedBird(name)) {
            this.birdAtlas.addObservationToBird(name);
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void printAll() {
        this.birdAtlas.printBirdDetails();
    }

    public void printOneBird(String name) {
        this.birdAtlas.printBirdDetails(name);
    }

}
