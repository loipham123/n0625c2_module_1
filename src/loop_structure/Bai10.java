package loop_structure;

import java.util.Scanner;

/**
 * Viết chương trình tính :
 * <p>
 * S=1+1/2+1/3+....+1/n
 * <p>
 * Số n được nhập từ bàn phím
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        double s = 0.0;

        for (int i = 1; i <= n; i++){
            s=s+1.0/i;
            System.out.println(s + "\t");
        }
    }
}
