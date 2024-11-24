import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String[] textArr = new String[size];

        for(int i = 0; i < size; i++){
            textArr[i] = sc.next();
        }

        for(int i = 0; i < size; i++){
            String[] parse = textArr[i].split("");
            String first = parse[0];
            int lastNum = parse.length - 1;
            String last = parse[lastNum];
            System.out.println(first + last);
        }


    }
}
