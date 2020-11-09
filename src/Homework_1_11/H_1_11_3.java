package Homework_1_11;
import java.util.Scanner;

public class H_1_11_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[][] = new int[n][n];
        boolean f = true;
        for (int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                A[i][j] = in.nextInt();
            }
        }

        for (int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if (A[i][j]!=A[j][i]){
                    f = false;
                    break;
                }
            }
        }
        if (f){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
