import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int check = 0;
        int start = 666;

        while (true){
            String changeInt = String.valueOf(start);
            if(changeInt.contains("666")){
                check++;
            }

            if(check == cnt) {
                System.out.println(start);
                break;
            }
            start++;
        }
    }
}

