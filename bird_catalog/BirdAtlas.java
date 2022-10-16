
import java.util.ArrayList;

public class BirdAtlas {

    private Bird bird;
    private ArrayList<Bird> birdAtlas;

    public BirdAtlas() {
        this.birdAtlas = new ArrayList<>();
    }

    public void addBirdToAtlas(String name, String latinName) {
        this.bird = new Bird();
        this.bird.addBird(name, latinName);
        this.birdAtlas.add(this.bird);
    }

    public void addObservationToBird(String name) {
        for (Bird bird : this.birdAtlas) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
            }
        }
    }

    public void printBirdDetails() {
        for (Bird bird : this.birdAtlas) {
            bird.printBird();
        }
    }

    public void printBirdDetails(String name) {
        for (Bird bird : this.birdAtlas) {
            if (bird.getName().equals(name)) {
                bird.printBird();
                break;
            }
        }
    }

    public boolean isItObservedBird(String name) {
        for (Bird bird : this.birdAtlas) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}
