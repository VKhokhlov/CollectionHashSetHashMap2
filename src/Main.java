import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
            "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut " +
            "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore " +
            "eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt " +
            "mollit anim id est laborum.";

    public static void main(String[] args) {
        WordsChecker wordsChecker = new WordsChecker(text);
        Scanner scanner = new Scanner(System.in);

        System.out.println(text);

        while (true) {
            System.out.println("Введите слово для проверки (stop - выход; text - вывести текст): ");

            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }

            if (input.equals("text")) {
                System.out.println(text);
                continue;
            }

            System.out.println((wordsChecker.hasWord(input) ? "Слово есть в тексте" : "Слова нет в тексте"));
        }
    }
}