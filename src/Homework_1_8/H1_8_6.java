package Homework_1_8;

import java.util.Scanner;

public class H1_8_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int max = 0, k = 0, amax = 0;
        for (int i = 0; i<n; i++){
            a[i] = in.nextInt();
        }
        for (int i =0;i<n;i++){
            k = 0;
            for (int j = 0; j<n; j++){
                if (a[i]==a[j]){
                    k +=1;
                }
            }
            if (k>max){
                max = k;
                amax = a[i];
            }
        }
        System.out.println(amax);
    }
}
