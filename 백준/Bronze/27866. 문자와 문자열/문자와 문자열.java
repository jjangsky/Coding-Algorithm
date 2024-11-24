import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int num = sc.nextInt();

        String[] arr = text.split("");
        System.out.println(arr[num-1]);


    }
}
