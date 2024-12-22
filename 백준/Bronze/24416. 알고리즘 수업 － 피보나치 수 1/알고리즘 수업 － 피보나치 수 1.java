import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int code1;
    static int code2;

    static int[] f;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        code1 = 0;
        code2 = 0;

        int n = Integer.parseInt(br.readLine());
        f = new int[n];

        fib(n);
        fibonacci(n);

        System.out.println(code1);
        System.out.println(code2);

    }

    private static int fib (int n){
        if (n == 2 || n == 1){
            code1++;
            return 1;
        }
        return (fib(n-1) + fib(n-2));
    }

    private static void fibonacci(int n){
        f[0] = 1;
        f[1] = 1;

        for(int i = 2; i < n; i++){
            code2++;
            f[i] = f[i-1] + f[i-2];
        }
    }
}