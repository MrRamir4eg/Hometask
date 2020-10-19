package Homework_1_8;
import java.util.Scanner;

public class H1_8_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        float sum = 0;
        int k = 0;
        float d = 0;
        boolean f = false;
        for (int i=0; i<n;i++){
            a[i]= in.nextInt();
            if(a[i]%2==1 || a[i]%2==-1){
                sum = sum+a[i];
                k += 1;
                f = true;
            }
        }
        if (f) {
            d = sum/k;
            System.out.printf("%.2f", d);
        }
        else{
            System.out.println("NO");
        }
    }
}
