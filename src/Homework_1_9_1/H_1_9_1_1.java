package Homework_1_9_1;

import java.util.Scanner;

public class H_1_9_1_1 {
    static void lol(int x){
        System.out.println(x/10 + x%10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        lol(x);
    }
}
