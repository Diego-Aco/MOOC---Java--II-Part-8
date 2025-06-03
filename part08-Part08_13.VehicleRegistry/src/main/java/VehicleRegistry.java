import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner) {
        if (owners.get(licensePlate)==null) {   //if licensePlate doesn't already have owner, assign one
            owners.put(licensePlate, owner);
            return true;
        }
        return false;                           //otherwise, do nothing and return false
    }

    public String get(LicensePlate licensePlate) {
        if (owners.get(licensePlate)==null) {
            return null;
        }
        return owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (owners.get(licensePlate)==null) {
            return false;
        }
        owners.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : owners.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<>();
        for (String owner : owners.values()) {
            if (ownerList.contains(owner)) {
                continue;
            }
            ownerList.add(owner);
            System.out.println(owner);
        }
    }

}
