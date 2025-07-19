package phuong_thuc;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();

        System.out.println("Cau a");
        System.out.printf("S= 1 + 2 + ... + %d = %d\n", n, calculateSumOfIntegers(n));

        System.out.println("Cau b");
        System.out.printf("S= 1^2 + 2^2 + ... + %d^2 = %d\n", n, calculateSumOfSquares(n));

        System.out.println("Cau c");
        System.out.printf("S= 1 + 1/2 + ... + 1/%d = %.2f\n", n, calculateSum(n));

        System.out.println("Cau d");
        System.out.printf("S = 1 * 2 * ... * %d = %d\n", n, calculateFactorial(n));

        System.out.println("Cau e");
        System.out.printf("S= 1! + 2! + ... + %d!= %d\n",n,calculateFactorialSum(n));
    }

    //Cau a.S=1+2+...+n
    static int calculateSumOfIntegers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //Cau b.S=1^2+2^2+...+n^2
    static int calculateSumOfSquares(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    //Cau c.S=1+1/2+...+1/n
    static double calculateSum(int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    //Cau d.S=1*2*...*n
    static long calculateFactorial(int n) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    //Cau e.S=1!+2!+...+n!
    static long calculateFactorialSum(int n) {
        long sum = 0;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
        }
        return sum;
    }
}
