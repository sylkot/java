
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private GradeStatistics points;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.points = new GradeStatistics();

    }

    public void start() {
        readPoints();
        printAvarege();
        printPassStat();
        printGradeDistribution();
    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(this.scan.nextLine());
            if (input == -1) {
                break;
            } else {
                this.points.add(input);
            }
        }
    }

    public void printAvarege() {
        System.out.println("Point average (all): " + this.points.avg());
    }

    public void printPassStat() {
        if (Double.isNaN(this.points.avgPassing())) {
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        } else {
            System.out.println("Point average (passing): " + this.points.avgPassing());
            System.out.println("Pass percentage: " + this.points.passPercentage());
        }
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        int grade = 5;
        while (grade >= 0) {
            int stars = points.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }

    }

}
