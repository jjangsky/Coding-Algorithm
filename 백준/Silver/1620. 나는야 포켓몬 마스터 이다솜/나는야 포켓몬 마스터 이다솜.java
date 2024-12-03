import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int pocketCnt = Integer.parseInt(input[0]);
        int printCnt = Integer.parseInt(input[1]);

        Map<Integer,String> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        // 밑에서 뽑아낼 때 1부터 값이 시작하므로 i는 1부터 시작
        for(int i = 1; i <= pocketCnt; i++) {
            String pocketmon = br.readLine();
            map1.put(i, pocketmon);
            map2.put(pocketmon, i);
        }

        for(int i = 0; i < printCnt; i++){
            String write = br.readLine();
            if(49 <= write.charAt(0) && write.charAt(0) <=57){
                int key = Integer.parseInt(write);
                System.out.println(map1.get(key) + " ");
            }else{
                System.out.println(map2.get(write)+ " ");
            }
        }
    }
}
