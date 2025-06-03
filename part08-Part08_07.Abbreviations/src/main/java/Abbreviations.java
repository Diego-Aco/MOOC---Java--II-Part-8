import java.util.HashMap;

public class Abbreviations {
    
    private HashMap<String,String> abbrevLookup;


    public Abbreviations(){
        abbrevLookup = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbrevLookup.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbrevLookup.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return abbrevLookup.get(abbreviation);
    }

}
