package Homework_1_8_2;

import java.util.Scanner;

public class H1_8_2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 0;
        int arr[] = new int[100];
        for (int i =0; i<n; i++){
            arr[i] = in.nextInt();
        }
        k = arr[0];
        for(int i = 1; i<n; i++){
            if (arr[i]>k){
                k = arr[i];
            }
        }
        System.out.println(k);
    }
}
