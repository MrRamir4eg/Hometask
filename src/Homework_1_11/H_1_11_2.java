package Homework_1_11;

import java.util.Scanner;

public class H_1_11_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[][] = new int[n][n];
        for (int i = 0; i<n;i++){
            A[i][n-1-i] = 1;
        }

        for (int i = 0; i<n; i++){
            for (int j=n-i-1; j<n;j++){
                if (A[i][j]!=1) {
                    A[i][j] = 2;
                }
            }
        }
        for (int i = 0; i<n; i++){
            for (int j=0; j<n;j++){
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
