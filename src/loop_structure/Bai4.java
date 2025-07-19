package loop_structure;

import java.util.Scanner;

/**
 * In dãy số 2, 4, -6, 8, 10, -12 … n (bằng ít nhất 2 cách khác nhau) (n là số nhập vào từ bàn phím)
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = sc.nextInt();

//        //c1
//        for (int i = 2; i <= n; i += 2) {
//            if (i % 6 == 0) {
//                System.out.println(-i);
//            } else {
//                System.out.println(i);
//            }
//        }
        //c2
        int count = 0;
        int distance = 3;
        for (int i = 2; i <= n; i += 2) {
            count++;
            if (count == distance) {
                System.out.print(-i + "\t");
                count = 0;
            } else {
                System.out.print(i + "\t");
            }
        }
    }
}
