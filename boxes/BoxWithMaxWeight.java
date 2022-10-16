
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> box;
    private int maxCapacity;

    public BoxWithMaxWeight(int capacity) {
        this.maxCapacity = capacity;
        this.box = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int sum = 0;
        for (Item thing : this.box) {
            sum += thing.getWeight();
        }
        if (sum + item.getWeight() <= this.maxCapacity) {
            this.box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.box.contains(item);
    }
}
