import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] result = new int[6];

        for(int i = 0; i < chess.length; i++){
            int input = sc.nextInt();
            result[i] = chess[i] - input;
        }

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }


    }
}
