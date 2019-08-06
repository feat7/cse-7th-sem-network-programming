package StringParsing;

class StringSplit {
    public static void main(String[] args) {
        String input = "My_name_is_vinay";
        String delimeter = "_";

        String[] splitArr = input.split(delimeter, 0);

        for (String a : splitArr) {
            System.out.println(a);
        }
    }
}