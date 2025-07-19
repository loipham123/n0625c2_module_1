package phuong_thuc;

import java.util.Scanner;

/**
 * Phương thức in ra n phần tử của dãy Fibonacy.
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        System.out.printf("%d phan tu cua day Fibonacci: \n", n);
        printFibonacci(n);
    }

    static void printFibonacci(int n) {
        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(fn + "\t");

            f1 = f2;
            f2 = fn;

            fn = f1 + f2;
        }
    }
}
