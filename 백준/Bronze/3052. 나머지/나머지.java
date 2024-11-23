import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        HashSet<Integer> hSet = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++){
            int num = sc.nextInt();
            hSet.add(num % 42);
        }
        System.out.println(hSet.size());
    }
}
