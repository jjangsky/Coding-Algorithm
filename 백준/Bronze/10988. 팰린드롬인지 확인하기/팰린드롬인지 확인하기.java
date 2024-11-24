import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        String[] arr = text.split("");

        int divide = arr.length / 2;
        boolean isCheck = true;

        for(int i = 0; i < divide; i++){
            if (!Objects.equals(arr[i], arr[arr.length - 1 - i])) {
                isCheck = false;
                break;
            }
        }

        if(isCheck){
            System.out.println(1);
        }else {
            System.out.println(0);
        }



    }
}
