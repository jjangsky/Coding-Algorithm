import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
        }

        int highVal= 0;
        int idx = 0;
        int cnt = 0;

        for(int i = 0; i < 9; i++){
            cnt++;

            if(arr[i] > highVal){
                highVal = arr[i];
                idx = cnt;
            }
        }

        System.out.println(highVal + "\n" + idx);

    }
}
