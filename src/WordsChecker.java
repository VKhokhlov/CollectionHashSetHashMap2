import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private Set<String> wordSet = new HashSet<>();

    public WordsChecker(String text) {
        String[] words = text.split("\\P{IsAlphabetic}+");

        for (String word: words) {
            wordSet.add(word);
        }
    }

    public boolean hasWord(String word) {
        return wordSet.contains(word);
    }
}
