package loop_structure;

import java.util.Scanner;

/**
 * In dãy số 2, 4, 6, 8, 10 … 2n (n là số nhập vào từ bàn phím) (*)
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n * 2; i += 2) {
            System.out.print(i + "\t");
        }
    }
}
