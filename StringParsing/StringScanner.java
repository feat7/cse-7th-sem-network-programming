import java.util.Scanner;

class StringScanner {
    public static void main(String[] args) {
        String string = "My name 5 6 1.23 is true vinay";
        Scanner scanner = new Scanner(string);
        int stringCount = 0, intCount = 0, doubleCount = 0, boolCount = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextBoolean())
                boolCount++;
            else if (scanner.hasNextInt())
                intCount++;
            else if (scanner.hasNextDouble())
                doubleCount++;
            else
                stringCount++;
            scanner.next();
        }
        scanner.close();

        System.out.println(string + " has " + stringCount + " strings, " + intCount + " integers, " + doubleCount
                + " double and " + boolCount + " boolean.");
    }
}