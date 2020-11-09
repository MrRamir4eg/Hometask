package Homework_1_9_2;
import java.util.Scanner;

public class H_1_9_2_2 {
        static int min (int a, int b, int c, int d){
            int min = 999999;
            if (a<b){
                min = a;
            }else
            {
                min = b;
            }
            if (c<min){
                min = c;
            }
            if (d<min){
                min = d;
            }
            return min;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            System.out.println(min(a,b,c,d));
        }
}
