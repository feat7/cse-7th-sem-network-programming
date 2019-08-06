import java.util.Scanner;

class CalculateCGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] marks = new Integer[5];
        int cgpa = 0;

        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your rollno:");
        Integer rollNo = scanner.nextInt();
        System.out.println("Enter your marks: ");

        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
            cgpa += calculate(marks[i]);
        }

        Double ans = Double.valueOf(cgpa);

        System.out.println("Entered name = " + name);
        System.out.println("Entered rollNo = " + rollNo);
        System.out.println("Entered cgpa = " + ans / 5);

    }

    public static int calculate(int marks) {
        if (marks >= 85)
            return 10;
        else if (marks >= 75)
            return 9;
        else if (marks >= 65)
            return 8;
        else if (marks >= 55)
            return 7;
        else if (marks >= 45)
            return 6;
        else if (marks >= 35)
            return 5;
        else
            return 0;
    }
}