package loop_structure;

import java.util.Scanner;

/**
 * In dãy số 1, 3, 7, 15, 31, …n (n là số nhập vào từ bàn phím)
 */
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int a = 1;
        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Nhap sai,Vui long nhap so > 0");
            }
        } while (n < 0);

        while (a <= n) {
            System.out.println(a);
            a = 2 * a + 1;
        }
    }
}
