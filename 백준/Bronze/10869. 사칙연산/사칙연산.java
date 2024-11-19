import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int sum = first + second;
        int minus = first - second;
        int multiply = first * second;
        int divide = first / second;
        int mod = first % second;

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(mod);

    }
}