package Homework_1_11;

import java.util.Scanner;

public class H_1_11_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int A[][] = new int[n][m];
        int A1[][] = new int[m][n];
        for (int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                A[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                A1[j][n-i-1] = A[i][j];
            }
        }
        System.out.println(m + " " + n);
        for (int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(A1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
