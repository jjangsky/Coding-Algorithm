import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = getResult(a, b, c);

        System.out.println(result);



    }

    private static int getResult(int a, int b, int c) {
        int result = 0;

        if (a == b && b == c){
            result = 10000 +  a * 1000;
        }else if(a == b || b == c || a == c){
            int max = 0;
            if( a == b || a == c){
                max = a;
            }else{
                max = b;
            }
            result = 1000+ max * 100;
        }else{
            int[] arr = {a, b, c};
            int max = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            result = max * 100;

        }
        return result;
    }
}