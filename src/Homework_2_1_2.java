import java.util.Scanner;

public class Homework_2_1_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
        if(x >-129 && x < 128) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        if(x>=-32768 && x<=32767) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
