import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountSameWord {

    public static void main(String[] args) {
        String text = "Ali veli ali aLi ahmet mehmet İstanbul'a gitti Nereye gitti istanbula gitti";
        text = text.toLowerCase();
        String[] words = text.split(" ");

        System.out.println(text);

        HashMap<String,Integer> wordFrequency = new HashMap<>();

        for (String word : words){
            word = word.replaceAll("[^a-zA-Z0-9]","");
            Integer value = wordFrequency.getOrDefault(word,0);
            wordFrequency.put(word,value + 1);
        }

        System.out.println("---Kelimeler ve Tekrar sayıları---");
        for (Map.Entry<String,Integer> entry: wordFrequency.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
