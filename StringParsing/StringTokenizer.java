import java.util.StringTokenizer;

class StringParsing {
    public static void main(String[] args) {
        String input = "My name is vinay";
        String delimeter = " ";
        StringTokenizer stringTokenizer = new StringTokenizer(input, delimeter);

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}