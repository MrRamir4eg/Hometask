package Homework_1_8_1;

import java.util.Scanner;

public class H1_8_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i<n;i++){
            System.out.print(1+(n+1)*i + " ");
        }

    }
}
