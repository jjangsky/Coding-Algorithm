import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        List<Map<String, Object>> list = new ArrayList<>();
        for(int i = 0; i < cnt; i++){
            Map<String, Object> hMap = new HashMap<>();
            String[] xy = br.readLine().split(" ");
            hMap.put("x", Integer.parseInt(xy[0])); // x 값을 정수로 저장
            hMap.put("y", Integer.parseInt(xy[1])); // y 값을 정수로 저장
            list.add(hMap);
        }

        Collections.sort(list, (o1, o2) -> {
            int x1 = (int) o1.get("x");
            int y1 = (int) o1.get("y");
            int x2 = (int) o2.get("x");
            int y2 = (int) o2.get("y");

            if (x1 != x2) {
                return Integer.compare(x1, x2); // x값 오름차순 정렬
            } else {
                return Integer.compare(y1, y2); // y값 오름차순 정렬
            }
        });

        list.forEach(m -> {
            int x = (int) m.get("x");
            int y = (int) m.get("y");
            System.out.println(x + " " + y);
        });


    }


}

