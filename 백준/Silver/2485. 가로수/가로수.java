import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];
        int minSize = 1000000000;

        for(int i = 0; i < cnt; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;
        // 다음 가로등 과 현재의 최대 공약수를 구해가며 공통된 최대공약수 구하기
        for(int i = 1; i < cnt; i++){
            gcd = maxNumDivide(arr[i] - arr[0], gcd);
        }

        int total = (arr[cnt-1] - arr[0] ) / gcd + 1;
        System.out.println(total - arr.length);

    }

    // 최대 공약수 구하기
    private static int maxNumDivide(int a, int b){
        while (b != 0){
            int temp = b;
            b = a% b;
            a = temp;
        }
        return a;
    }
}
