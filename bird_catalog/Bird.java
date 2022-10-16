
public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird() {
        this.observations = 0;
    }

    public void addBird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public void addObservation() {
        this.observations++;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getObservations() {
        return this.observations;
    }
    
    public void printBird() {
        System.out.println(this.name + " (" + this.latinName + "): " + this.observations + " observations");
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (compared instanceof Bird) {
            return true;
        }

        Bird comparedBird = (Bird) compared;
        if (this.name == comparedBird.name) {
            return true;
        }

        return false;

    }

}
