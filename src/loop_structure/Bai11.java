package loop_structure;

import java.util.Scanner;

/**
 Viết chương trình tính:

 S = 1+1/3!+1/5!+…..+1/(2n-1)!

 Số n được nhập từ bàn phím

 3! = 6
 5! = 120
 1 + 1/6 + 1/12o
 */
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Nhap sai,Vui long nhap so > 0");
            }
        } while (n < 0);

        double s = 0.0;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            s +=   1.0 / fact;
            fact *= (2 * i) * (2 * i + 1);
        }
        System.out.print(s + "\t");
    }
}
