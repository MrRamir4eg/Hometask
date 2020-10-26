package Homework_1_8_2;

import java.util.Scanner;

public class H1_8_2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 0;
        int arr[] = new int[1000];
        for (int i =0; i<n; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i<n; i++){
            if (arr[i]>0){
                k+=1;
            }
        }
        System.out.println(k);
    }
}
