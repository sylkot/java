
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiteracyComparison {

    public static void main(String[] args) {
        

        String fileName = "literacy.csv";

        try {
            Files.lines(Paths.get(fileName)).map(line -> line.split(",")).filter(split -> split.length == 6).sorted((p1, p2) -> {
                return Double.compare(Double.valueOf(p1[5]), Double.valueOf(p2[5]));
            }).forEach(line -> System.out.println(line[3] + " (" + line[4] + "), " + line[2].split(" ")[1] + ", " + line[5]));
        } catch (IOException ex) {
            Logger.getLogger(LiteracyComparison.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
