import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        double grade;
        double attendance;
        boolean eligible;

    System.out.print("Enter grade: ");
        grade = sc.nextDouble();
    System.out.print("Enter attendance: ");
        attendance = sc.nextDouble();

    eligible = grade >= 85 && attendance >= 80;
    System.out.println("Eligible: " + eligible);
    }
}