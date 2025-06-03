import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> contentsHashMap; //key is storage unit, value is list of items

    public StorageFacility() {
        this.contentsHashMap = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.contentsHashMap.putIfAbsent(unit, new ArrayList<>());
        this.contentsHashMap.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.contentsHashMap.get(storageUnit) == null) {
            return new ArrayList<>();
        }
        ArrayList<String> contents = this.contentsHashMap.get(storageUnit);
        return contents;
    }

    public void remove(String storageUnit, String item) {
        if (this.contentsHashMap.get(storageUnit) != null) {    //if arraylist value for a given key exists (but can be empty list)
            ArrayList<String> unitContents = this.contentsHashMap.get(storageUnit);
            unitContents.remove(item);
            //System.out.println("DEBUG STATEMENT: ARRAYLIST unitContents is " + unitContents);
            if (unitContents.size()==0) {               //if list is now empty, then remove entire mapping of unit to contents
                this.contentsHashMap.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        for (String unit : this.contentsHashMap.keySet()) {
            storageUnits.add(unit);
        }
        return storageUnits;
    }

}
