
import java.util.ArrayList;

public class Recipe {

    private String name;
    private int duration;
    private ArrayList<String> ingredients;

    public Recipe() {
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getDuration() {
        return this.duration;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }

//    public void printRecipe() {
//        System.out.println(this.name + ", cooking time: " + this.duration + ", ingredients: " + this.ingredients);
//    }

    public void printRecipeInfo() {
        System.out.println(this.name + ", cooking time: " + this.duration);
    }

}
