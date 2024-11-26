import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int up = Integer.parseInt(inputs[0]);
        int down = Integer.parseInt(inputs[1]);
        int day = Integer.parseInt(inputs[2]);

        int result = (int) Math.ceil((double) (day - down) / (up -down));
        System.out.println(result);
        }
}

