import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] arr;
    private static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        int a = Integer.parseInt(inputArr[0]);
        int b = Integer.parseInt(inputArr[1]);

        arr = new int[b];

        dfs(a, b, 0);
        System.out.println(result);

    }


    private static void dfs(int a, int b, int depth){
        // 최고값에 도달 했을 때 배열 출력
        if(depth == b){
            for (int val: arr){
                result.append(val).append(' ');
            }
            result.append('\n');
            return;
        }

        for(int i = 0; i < a; i++){
                arr[depth] = i + 1;
                dfs(a, b, depth+1);
        }
    }
}


