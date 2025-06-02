import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        factorial();
    }

    public static void factorial() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Factorial Calculator");

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int factorial = 1;
        int i;
        for (i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! is " + factorial);
        System.out.println("Note: '!' is factorial sign");

    }
}
