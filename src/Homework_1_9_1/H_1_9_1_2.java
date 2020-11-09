package Homework_1_9_1;

import java.util.Scanner;

public class H_1_9_1_2 {
    static void lol(){
        int k = 0;
        for(int i=10;i<=99;i++){
            if (i%7==0) {
                k = k + i / 10 + i % 10;
            }
        }
        System.out.println(k);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        lol();
    }
}
