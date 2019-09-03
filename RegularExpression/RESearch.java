import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RESearch {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter string:");
        // String string = scanner.next();
        // System.out.println("Enter regex:");
        // String regex = scanner.next();
        // System.out.println("Enter replacement:");
        // String replace = scanner.next();

        String string = "The dog says meow. " + "All dogs say meow.";
        String regex = "dog";
        String replace = "cat";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        string = matcher.replaceAll(replace);

        System.out.println("Replaced: " + string);

    }
}