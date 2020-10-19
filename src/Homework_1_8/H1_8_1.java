package Homework_1_8;
import java.util.Scanner;

public class H1_8_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int num = 0;
        boolean f = false;
        for (int i=0; i<n;i++){
            a[i]= in.nextInt();
        }
        int l = in.nextInt();
        for (int i=0; i<n;i++){
            if (a[i]==l){
                f = true;
                num = i;
                break;
            }
        }
        if (f) {
            System.out.println(num+1);
        }
        else{
            System.out.println("NO");
        }
    }
}
