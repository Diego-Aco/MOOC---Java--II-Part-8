import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());

        System.out.println("Testing stuff below");
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Sally", 25);
        System.out.println(ages.get("Cal"));

    }
}
