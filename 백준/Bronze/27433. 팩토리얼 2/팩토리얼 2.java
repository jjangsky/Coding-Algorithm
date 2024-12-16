import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        long result = factorialRecursion(num);
        System.out.println(result);


    }

    private static long factorialRecursion(int number){
        if(number==0||number==1){
            return 1;
        }
        else{
            return number*factorialRecursion(number-1);
        }
    }

}


