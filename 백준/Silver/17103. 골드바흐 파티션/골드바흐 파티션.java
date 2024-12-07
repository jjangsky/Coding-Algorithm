import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        boolean[] isPrime = sieveOfEratosthenes(1000000);
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= 1000000; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }


        for(int i = 0; i <cnt; i++) {
            int input = Integer.parseInt(br.readLine());
            int count = 0;
            // 소수 list 를 반복문 돌리면서
            // 입력값에서 소수를 뺀 값이 소수로 판정되면 +1
            for (int prime : primes) {
                if (prime > input / 2) break; // 중복 계산 방지
                if (isPrime[input - prime]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static boolean[] sieveOfEratosthenes(int a){

        boolean[] result = new boolean[a + 1];
        Arrays.fill(result, true);

        result[0] = false;
        result[1] = false;

        for(int i = 2; i <= Math.sqrt(a); i++){
            if(result[i]){
                for (int j = i*i ; j <= a; j += i){
                    result[j] = false;
                }
            }
        }
        return result;
    }

}



