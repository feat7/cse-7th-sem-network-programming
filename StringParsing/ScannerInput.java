import java.util.Scanner;

class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your rollno:");
        Integer rollNo = scanner.nextInt();
        System.out.println("Enter your cgpa:");
        Double cgpa = scanner.nextDouble();

        System.out.println("Entered name = " + name);
        System.out.println("Entered rollNo = " + rollNo);
        System.out.println("Entered cgpa = " + cgpa);

    }
}