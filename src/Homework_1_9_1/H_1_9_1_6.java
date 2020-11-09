package Homework_1_9_1;
import java.util.Scanner;

public class H_1_9_1_6 {
    public static int[] bin(int[] a){
        int min = 999999;
        int ind = 0;
        int a1[] = new int[a.length];
        for (int i = 0; i<a.length; i++){
            if (a[i]<min){
                min = a[i];
                ind = i;
            }
        }
        for (int i = 0; i<a.length; i++){
            if (i<ind){
                a1[i+1]=a[i];
            }else {
                if (i == ind) {
                    a1[0] = a[ind];
                }
                else{
                    a1[i]=a[i];
                }
            }
        }
        return a1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int a1[] = new int[n];
        for (int i = 0; i<n; i++){
            a[i] = in.nextInt();
        }
        a1 = bin(a);
        for (int i =0; i<n; i++){
            System.out.print(a1[i]+" ");
        }
    }
}
