
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadRecepieFile {

    private ArrayList<ArrayList> recepieFile;
    private ArrayList<String> recepie;
    private Scanner scan;

    public ReadRecepieFile() {
        this.recepieFile = new ArrayList<>();
        this.recepie = new ArrayList<>();
    }

    public ArrayList<ArrayList> readRecipeFile(String fileName) {
        //String fileName = "recipes.txt";
        try {
            this.scan = new Scanner(Paths.get(fileName));
            while (scan.hasNextLine()) {
                String text = scan.nextLine();
                if (text.isEmpty()) {
                    this.recepieFile.add(recepie);
                    this.recepie = new ArrayList<>();
                    continue;
                }
                this.recepie.add(text);
                if (!scan.hasNextLine()) {
                    this.recepieFile.add(recepie);
                }
            }
        } catch (IOException ex) {
            System.out.println(fileName + " not found.");;
        }        
        return this.recepieFile;
    }

}
