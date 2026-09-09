import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double grade;

        System.out.print("Enter grade: ");
        grade = sc.nextDouble();

        String result = grade >= 75 ? "PASSED" : "FAILED";

        System.out.println("Result: " + result);
    }
}
