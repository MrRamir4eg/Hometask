package Homework_1_8_1;

import java.util.Scanner;

public class H1_8_1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;
        while (n>1){
            c = n%2;
            System.out.print(c);
            n=n/2;
        }
        System.out.print(n);
    }
}
