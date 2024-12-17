import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static char[] line;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = br.readLine()) != null) {

            int num = Integer.parseInt(input);
            int size = (int) Math.pow(3, num);

            line = new char[size];
            Arrays.fill(line, '-');

            recursion(0, size);
            System.out.println(line);
        }
    }

    private static void recursion(int start, int size){
        // 나눌 값이 1아래면 중단
        if(size <= 1){
            return;
        }
        int quotient = size / 3;

        for(int i = start + quotient; i < start + quotient *2; i++){
            line[i] = ' ';
        }

        // 첫 번째 구역
        recursion(start, quotient);
        // 마지막 구역
        recursion( start+quotient *2, quotient);
    }

}


