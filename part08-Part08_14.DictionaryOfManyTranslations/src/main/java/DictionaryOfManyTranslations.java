import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations{

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<String, ArrayList<String>>();
    }

    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> translations = this.dictionary.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {   //returns list of translations
        if (this.dictionary.keySet().contains(word)) {
        return this.dictionary.get(word);
        }
        return new ArrayList<String>();
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }
}