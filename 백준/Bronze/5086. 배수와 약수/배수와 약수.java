import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {


            String[] parts = line.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);


            if (a == 0 && b == 0) {
                break;
            }


            if(b % a == 0){
                System.out.println("factor");
            }else if(a % b == 0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }

        }
    }
}

