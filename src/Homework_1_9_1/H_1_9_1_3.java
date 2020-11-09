package Homework_1_9_1;

import java.util.Scanner;

public class H_1_9_1_3 {
    static void lol(int x){
        int k = 0;
        for(int i = 100; i<x;i++){
            if((i/100+i%10+(i/10)%10) % 13 == 0){
                k +=1;
            }
        }
        System.out.println(k);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        lol(x);
    }
}
