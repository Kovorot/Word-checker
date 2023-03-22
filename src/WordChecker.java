public class WordChecker {

    protected String text;

    public WordChecker (String text) {
        this.text = text;
    }

    public boolean hashCode(String input) {
        String text = this.text.toLowerCase();
        String word = input.toLowerCase();

        if (text.contains(word)) {
            return true;
        } else {
            return false;
        }
    }
}
