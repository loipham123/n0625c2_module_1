package loop_structure;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        do {
            System.out.println("Nhap m:");
            m = sc.nextInt();
            if (m < 0) {
                System.out.println("Vui long nhap so nguyen duong");
            }
        } while (m < 0);
        int s = 0;
        int p = 1;

        while (m > 0) { // m =123
            int digit = m % 10;
            s += digit;
            p *= digit;
            m = m / 10;
        }
        System.out.println("S: " + s);
        System.out.println("P: " + p);
    }
}
