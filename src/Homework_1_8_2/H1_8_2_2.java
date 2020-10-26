package Homework_1_8_2;

import java.util.Scanner;

public class H1_8_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[1000];
        for (int i =0; i<n; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i<n; i++){
            if (i%2==0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
