import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrSize = sc.nextInt();

        int arr[] = new int[arrSize];

        for (int i = 0; i < arrSize; i++ ){
            arr[i] = sc.nextInt();
        }

        int findNum = sc.nextInt();
        int checkCnt = 0;
        for (int i = 0; i < arrSize; i++ ){
            if(findNum == arr[i]){
                checkCnt++;
            }
        }

        System.out.println(checkCnt);


    }
}
