package Homework_1_9_2;
import java.util.Scanner;

public class H_1_9_2_1 {


        static public double per (double x, double y, double x1, double y1, double x2, double y2){
            double p = 0;
            double a = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
            double b = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
            double c = Math.sqrt((x2-x)*(x2-x) + (y2-y)*(y2-y));
            p = a + b + c;
            return p;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double x = in.nextInt();
            double y = in.nextInt();
            double x1 = in.nextInt();
            double y1 = in.nextInt();
            double x2 = in.nextInt();
            double y2 = in.nextInt();
            double p = per(x,y,x1,y1,x2,y2);
            System.out.printf("%.10f", p);
        }
}
