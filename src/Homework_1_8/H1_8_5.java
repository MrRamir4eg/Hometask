package Homework_1_8;
import java.util.Scanner;

public class H1_8_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int a1[] = new int[n];
        int k = n;
        for (int i=0; i<n;i++){
            a[i]= in.nextInt();
            a1[k-i-1]=a[i];
        }
        for (int i=0; i<n;i++){
            System.out.print(a1[i] + " ");
        }
    }
}
