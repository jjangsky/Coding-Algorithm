import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] textArr = text.toCharArray();

        for (int i = 0; i < alphabet.length; i++){
            for (int j = 0; j < textArr.length; j++){
                if(alphabet[i] == textArr[j]){
                    System.out.print(j + " ");
                    break;
                }
                if(j == textArr.length -1){
                    System.out.print(-1 + " ");
                }
            }

        }



    }
}
