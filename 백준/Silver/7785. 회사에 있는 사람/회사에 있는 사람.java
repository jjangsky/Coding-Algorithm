import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Map<String, String> m = new HashMap<>();


        // Map 저장
        for(int i = 0; i < cnt; i++){
            String[] input = br.readLine().split(" ");
            m.put(input[0], input[1]);
        }

        List<String> userList = new ArrayList<>();

        // value값을 찾아서 조건 처리
        for(Map.Entry<String, String> entry: m.entrySet()){
            if(entry.getValue().equals("enter")){
                userList.add(entry.getKey());
            }
        }

        Collections.sort(userList, Collections.reverseOrder());

        for(String user : userList){
            System.out.println(user);
        }

    }
}
