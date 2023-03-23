import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordChecker {
    private static Set<String> words = new HashSet<>();

    protected String text;

    public WordChecker (String text) {
        this.text = text;
    }

    public boolean hashWord(String input) {
        String text = this.text.toLowerCase();
        words.addAll(List.of(text.split("\\P{IsAlphabetic}+")));

        if (words.contains(input.toLowerCase())) {
            System.out.println("Слово есть");
            return true;
        } else {
            System.out.println("Слова нет");
            return false;
        }
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
