package Homework_1_8_1;

import java.util.Scanner;

public class H1_8_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = n*(n+1)/2;
        int d = 0;
        for (int i = 0; i<n-1;i++){
            d = in.nextInt();
            sum = sum - d;
        }
        System.out.print(sum);
    }
}
