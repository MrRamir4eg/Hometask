package Homework_1_8_2;

import java.util.Scanner;

public class H1_8_2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 0;
        int arr[] = new int[1000];
        for (int i =0; i<n; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i<n-1; i++){
            if (arr[i]<arr[i+1]){
                k+=1;
            }
        }
        System.out.println(k);
    }
}
