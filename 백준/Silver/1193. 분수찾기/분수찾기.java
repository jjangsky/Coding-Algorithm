import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());

        int layer = 1;
        while(target-layer > 0) {
            target -= layer;
            layer++;
        }

        // 계층에 +1 해줘야 분모와 분자의 합이 성립
        int hap = layer + 1;

        if(layer % 2 == 0){
            System.out.println(target + "/" + (hap-target));
        }else{
            System.out.println((hap-target) + "/" + target);
        }
    }

}

