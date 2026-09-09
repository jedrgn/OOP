import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double grade;

        System.out.print("Enter grade: ");
        grade = input.nextDouble();

        String result = grade >= 75 ? "PASSED" : "FAILED";

        System.out.println("Result: " + result);
    }
}