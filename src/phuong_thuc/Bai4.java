package phuong_thuc;

import java.util.Scanner;


import static java.lang.Math.max;
import static java.lang.Math.min;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a=sc.nextInt();

        System.out.print("Nhap b: ");
        int b=sc.nextInt();

        System.out.printf("USCLN cua %d va %d la: %d\n",a,b,timUsCLN(a,b));
    }

    static int timUsCLN(int a, int b) {
        a=Math.abs(a);
        b=Math.abs(b);

        if (max(a, b) % min(a, b) == 0) {
            return min(a, b);
        }
        for (int i = min(a, b) / 2; i >= 1; i--) {
            if (a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }
}
