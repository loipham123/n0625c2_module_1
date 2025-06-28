package loop_structure;

import java.util.Scanner;

/**
 * In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);
        }
    }
}
