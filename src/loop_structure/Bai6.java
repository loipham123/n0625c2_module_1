package loop_structure;

import java.util.Scanner;

/**
 * In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n (n là số nhập vào từ bàn phím)
 */
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int count = 0;
        int distance = 1;

        for (int i = 2; i <= n; i += 2) {
            if (count == distance) {
                System.out.print(-i + "\t");
                count = 0;
                distance++;
            } else {
                System.out.print(i + "\t");
                count++;
            }
        }
    }
}
