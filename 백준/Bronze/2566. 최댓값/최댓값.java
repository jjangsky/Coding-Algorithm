import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxValue = 0;
        int m = 1;
        int n = 1;

        int[][] arr = new int[9][9];
        for(int i = 0; i < 9; i++){
            String[] line = br.readLine().split(" ");
            for (int j =0; j < 9 ; j++){
                arr[i][j] = Integer.parseInt(line[j]);
                if (arr[i][j] > maxValue){
                    maxValue = arr[i][j];
                    m = i + 1;
                    n = j + 1;
                }
            }
        }
        System.out.println( maxValue);
        System.out.println(m + " " +n);







    }
}