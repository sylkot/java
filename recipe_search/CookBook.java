
import java.util.ArrayList;

public class CookBook {

    private Recipe recipe;
    private ArrayList<Recipe> cookBook;
//    private ReadRecepieFile reader;

    public CookBook() {
        this.cookBook = new ArrayList<>();
    }

    public void createCookBook(ArrayList<ArrayList> recipes) {
        for (ArrayList recipeRaw : recipes) {
            recipe = new Recipe();
            recipe.setName(String.valueOf(recipeRaw.get(0)));
            recipe.setDuration(Integer.valueOf(String.valueOf(recipeRaw.get(1))));
            for (int i = 2; i < recipeRaw.size(); i++) {
                recipe.addIngredients(String.valueOf(recipeRaw.get(i)));
            }
            this.cookBook.add(recipe);
        }
    }

//    public void printCookBook() {
//        for (Recipe recipe : this.cookBook) {
//            recipe.printRecipe();
//        }
//    }
    public void printRecepiesDetails() {
        for (Recipe recipe : this.cookBook) {
            recipe.printRecipeInfo();
        }
    }

    public void listRecepiesKeyName(String keyword) {
        for (Recipe recipe : this.cookBook) {
            if (recipe.getName().contains(keyword)) {
                recipe.printRecipeInfo();
            }
        }
    }

    public void listRecepiesKeyTime(int maxTime) {
        for (Recipe recipe : this.cookBook) {
            if (recipe.getDuration() <= maxTime) {
                recipe.printRecipeInfo();
            }
        }
    }

    public void listRecepiesKeyIngredient(String ingredient) {
        for (Recipe recipe : this.cookBook) {
            if (recipe.getIngredients().contains(ingredient)) {
                recipe.printRecipeInfo();
            }
        }
    }

}
