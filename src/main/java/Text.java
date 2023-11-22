import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    public static String text = "Hello,  world world!";

    private static String removeDupWhiteSpaces(String t) {
        return t.replaceAll(" +", " ");
    }

    private static String removeDuplicateWords(String t) {
        String aux = t;
        String regex = "\\b(\\w+)((?:\\W+\\1\\b)+)";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(t);

        while (m.find()) {
            aux = aux.replaceAll(m.group(), m.group(2));
        }

        return aux;
    }

    public static void left() {
        text = removeDupWhiteSpaces(text);
    }

    public static void right() {
        text = removeDuplicateWords(text);
    }

    public static String main() {
        left(); // expected output: "Hello, world world!"
        right(); // expected output: "Hello,   world!"
        return text; // real output: "Hello,  world!"
    }
}
