package Homework_1_8;

import java.util.Scanner;

public class H1_8_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int a1[] = new int[n];
        int k = 0;
        for (int i = 0; i<n; i++){
            a[i] = in.nextInt();
        }
        for (int i =0;i<n;i++){
            for (int j = 0; j<n; j++){
                if (a[j]<0){
                    a1[k] = a[j];
                    a[j]=0;
                    k +=1;
                    break;
                }
            }
        }
        for (int i =0;i<n;i++){
            for (int j = 0; j<n; j++){
                if (a[j]>0){
                    a1[k] = a[j];
                    a[j]=0;
                    k +=1;
                    break;
                }
            }
        }
        for (int i =0;i<n;i++){
            System.out.print(a1[i] + " ");
        }
    }
}
