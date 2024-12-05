import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        long cnt = Long.parseLong(br.readLine());

        for (long i = 0; i < cnt; i++){
            long num = Long.parseLong(br.readLine());
            System.out.println(decimal(num));
        }
    }

    private static long decimal(long a){
        long i = 2;
        while (true){

            if (a <= 1) return 2; // 1 이하의 경우 소수는 2부터 시작

            if (isPrime(a)) {
                return a; // 소수면 반환
            } else {
                a++; // 소수가 아니면 다음 수로 이동
            }
        }
    }

    // 소수 검사 method
    private static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2) return true; // 2는 소수
        if (num % 2 == 0) return false; // 짝수는 소수가 아님

        // 제곱근 처리하여 좀 더 좁은 범위 탐색 -> 제곱근 이상의 값에서 나누어지지 않음
        long sqrt = (long) Math.sqrt(num);
        for (long i = 3; i <= sqrt; i += 2) { // 홀수만 검사
            if (num % i == 0) {
                return false; // 약수가 존재하면 소수가 아님
            }
        }
        return true; // 소수 판정
    }
}


