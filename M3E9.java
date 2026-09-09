import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a, b;

    System.out.print("Enter first number: ");
        a = sc.nextInt();
    System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.println("AND=" + (a & b));
        System.out.println("OR=" + (a | b));
        System.out.println("XOR=" + (a ^ b));
        System.out.println("NOT a=" + (~a));
        System.out.println("a<<1=" + (a << 1));
        System.out.println("a>>1=" + (a >> 1));
    }
}