
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (this.storage.containsKey(unit)) {
            this.storage.get(unit).add(item);
        } else {
            this.storage.put(unit, new ArrayList<>());
            this.storage.get(unit).add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.storage.containsKey(storageUnit)) {
            return this.storage.get(storageUnit);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);
        if (this.storage.get(storageUnit).size() == 0) {
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        for (String storage: this.storage.keySet()) {
            storageUnits.add(storage);
        }
        return storageUnits;
    }
}
