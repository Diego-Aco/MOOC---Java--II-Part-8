import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> debtHashMap;

    public IOU(){
        debtHashMap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        debtHashMap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return debtHashMap.getOrDefault(toWhom, 0.0);
    }
}
