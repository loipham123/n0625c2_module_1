package loop_structure;

import java.util.Scanner;

/**
 * In dãy số 1, 2, 3, 5, 8, 13, …n (n là số nhập vào từ bàn phím) (*).
 * <p>
 * Fibonacci là một chuỗi các số bắt đầu từ 0, 1 với quy luật số phía sau là tổng của 2 số đứng liền trước.
 */
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int f1 = 0;
        int f2 = 1;
        int fn = 1;
        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Nhap sai,Vui long nhap so > 0");
            }
        } while (n < 0);

        while (fn <= n) {
            System.out.print(fn + "\t");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}

