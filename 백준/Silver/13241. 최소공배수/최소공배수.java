import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        // 최대 공약수 구하기
        long gcdNum = getGcd(a, b);

        // 최소 공배수 구하기
        long result = ( a * b) / gcdNum;
        System.out.println(result);

    }

    private static long getGcd(long a,  long b){
        while (b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

