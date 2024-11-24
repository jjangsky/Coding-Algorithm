import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int totalLine = 2 * input - 1;
        for(int i = 1; i <= totalLine; i++){
            if( i < input){
                for(int j = 1; j<= totalLine; j++){
                    if (j <= input +(i-1) && j >= input - (i-1)){
                        System.out.print("*");
                    }else{
                        if (j <= input) {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }

            if( i == input){
                for (int k = 0; k < totalLine; k++){
                    System.out.print("*");
                }
                System.out.println();
            }

            if( i > input){
                int otherLine = totalLine - i ;
                for(int q =1 ; q<=  totalLine; q++){
                    if( q <= input + otherLine && q >= input - otherLine){
                        System.out.print("*");
                    }else{
                        if(q <= input){
                            System.out.print(" ");
                        }
                    }

                }
                    System.out.println();
            }
        }
    }
}
