
import java.util.ArrayList;

public class GradeStatistics {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public GradeStatistics() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void add(int point) {
        if (point >= 0 && point <= 100) {
            this.points.add(point);
            this.grades.add(pointsToGrade(point));
        }
    }

    public double avg() {
        int sum = 0;
        for (int point : this.points) {
            sum += point;
        }
        return sum * 1.0 / this.points.size();
    }

    public double avgPassing() {
        int sum = 0;
        int count = 0;
        for (int point : this.points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }
        return sum * 1.0 / count;
    }

    public double passPercentage() {
        int count = 0;
        for (int point : this.points) {
            if (point >= 50) {
                count++;
            }
        }
        return count * 100.0 / this.points.size();
    }

    public static int pointsToGrade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }
}
