import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int total = cnt;
        boolean isCheck = false;
        for (int i = 0; i < cnt; i++){
            for(int j = 0; j < cnt; j++){
                if(((5*i) + (3*j)) == cnt){
                    if((i + j) < total){
                        total = i + j;
                        isCheck = true;
                    }
                }
            }
        }

        if(isCheck){
            System.out.println(total);
        }else{
            System.out.println(-1);
        }

    }
}

