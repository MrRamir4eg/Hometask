package Homework_1_9_1;

import java.util.Locale;
import java.util.Scanner;

public class H_1_9_1_4 {
    public static void bin(double x, int n){
        for(int i = 0; i<n;i++){
            x = x*2;
            System.out.print((int) x);
            x = x%1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        int n = in.nextInt();
        bin(x,n);
    }
}
