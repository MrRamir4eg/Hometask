package Homework_1_8;
import java.util.Scanner;

public class H1_8_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int sum = 0;
        boolean f = false;
        for (int i=0; i<n;i++){
            a[i]= in.nextInt();
            if(a[i]%2==0){
                sum = sum+a[i];
                f = true;
            }
        }
        if (f) {
            System.out.println(sum);
        }
        else{
            System.out.println("NO");
        }
    }
}
