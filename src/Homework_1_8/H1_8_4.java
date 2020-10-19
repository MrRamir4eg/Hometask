package Homework_1_8;
import java.util.Scanner;
public class H1_8_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i=0; i<n;i++){
            a[i]= 7 + 3*(i-1);
            System.out.print(a[i] + " ");
        }
    }
}
