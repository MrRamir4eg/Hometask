package Homework_1_8_2;

import java.util.Scanner;

public class H1_8_2_1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int d = in.nextInt();
    int k = 0;
    int arr[] = new int[1001];
    for (int i =1; i<=n; i++){
        arr[i] = i;
    }

    for(int i = a; i<=(b+a)/2; i++){
        k = arr[i];
        arr[i]=arr[b+a-i];
        arr[b+a-i]=k;
    }
    for(int i = c; i<=(d+c)/2; i++){
        k = arr[i];
        arr[i]=arr[d+c-i];
        arr[d+c-i]=k;
    }
    for (int i =1; i<=n; i++){
        System.out.print(arr[i] + " ");
    }
}
}
