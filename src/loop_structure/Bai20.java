package loop_structure;

import java.util.Scanner;

/**
 * Viết chương trình tính S = a! + b! + c! với a, b, c là 3 số nguyên dương nhập từ bàn phím.
 */
public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        ;

        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        ;

        System.out.print("Nhap c: ");
        int c = sc.nextInt();

        int gta = 1;
        for (int i = 1; i <= a; i++) {
            gta = gta * i;
        }

        int gtb = 1;
        for (int i = 1; i <= b; i++) {
            gtb = gtb * i;
        }

        int gtc = 1;
        for (int i = 1; i <= c; i++) {
            gtc = gtc * i;
        }

        int s = gta + gtb + gtc;
        System.out.println("S= " + s);
    }
}
