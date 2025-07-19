package loop_structure;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Nhập 2 số nguyên dương a và b. Sau đó in ra ước số chung lớn nhất và bội số chung nhỏ nhất của 2 số nguyên dương a và b đó.
 */
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();

//        for (int i = a; ; i--) {
//            if (a % i == 0 && b % i == 0) {
//                System.out.println("USCLN la: " + i);
//                break;
//            }
//        }
//
//        for (int j = a; ; j++) {
//            if (j % a == 0 && j % b == 0) {
//                System.out.println("BSCNN la: " + j);
//                break;
//            }
//        }
        //cach 2
        int max=max(a,b);
        int min=min(a,b);

        if (max % min == 0) {
            System.out.println("USCLN la: " + min);
        } else {
            for (int i = min / 2; ; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println("USCLN la: " + i);
                    break;
                }
            }
        }
        for (int i = max; ; i += max) {
            if (i % min == 0) {
                System.out.println("BSCNN la: " + i);
                break;
            }
        }
    }
}
