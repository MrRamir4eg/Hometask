package Homework_1_9_1;

import java.util.Scanner;

public class H_1_9_1_5 {
    public static double bin(int a[]){
        double s = 0;
        int n = 0;
        for (int i = 0; i<a.length; i++){
            if(a[i]<10000 && a[i]>999){
                n++;
                s +=a[i];
            }
        }
        if (n==0){
            return -1;
        }else{
            return s/n;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i<n; i++){
            a[i] = in.nextInt();
        }
        System.out.printf("%.2f", bin(a));
    }
}
