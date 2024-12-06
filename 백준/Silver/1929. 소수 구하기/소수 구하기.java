import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String[] cnt = br.readLine().split(" ");
        int a = Integer.parseInt(cnt[0]);
        int b = Integer.parseInt(cnt[1]);

        // 에라토스테네스의 체 알고리즘 사용
        boolean[] isPrime = sieveOfEratosthenes(b);

        for(int i = a; i < isPrime.length; i++){
            if (isPrime[i]){
                System.out.println(i);
            }
        }
    }

    private static boolean[] sieveOfEratosthenes(int b){

        // 선택한 값 까지 받아오는 배열 선언
        boolean[] isPrime = new boolean[b + 1];

        // 배열의 기본값은 false 이므로 true로 변환
        for(int i = 0; i < isPrime.length; i++){
            isPrime[i] = true;
        }

        // 0과 1은 소수가 아님
        isPrime[0] = false;
        isPrime[1] = false;

        // 제곱근까지만 반복문 실행, 제곱근 이상의 수는 나올 수 없음
        for(int i = 2; i <= Math.sqrt(b); i++){
            // 아래 반복문에서 배수의 배열에 대해서는 모두 소수가 아님을 판별
            if(isPrime[i]){
                // i의 배수를 탐색하여 소수가 아님을 확인하는 작업, 시작은 i * i로 제곱으로 시작하며, i씩 더하여 배수 탐색
                for(int j = i * i; j <= b ; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

}


