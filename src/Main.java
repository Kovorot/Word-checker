public class Main {
    public static void main(String[] args) {
        WordChecker checker = new WordChecker("Основной функцией системы страхования является защита имущественных " +
                "интересов страхователей.");

        checker.hashWord("Анализ");    //false
        checker.hashWord("Защита");    //true
        checker.hashWord("труды");     //false
        checker.hashWord("система");   //false
        checker.hashWord("интересов"); //true
    }
}