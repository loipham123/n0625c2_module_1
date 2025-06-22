package java_overview;

import java.util.Scanner;

/**
 * Nhập bán kính của đường tròn. Tính chu vi và diện tích của hình tròn đó.
 *
 * Công thức
 * Chu vi: C = 2 * π * r
 * Diện tích: A = π * r²
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ban kinh: ");
        double r = scanner.nextDouble();

        System.out.printf("Chu vi hinh tron la: %.2f \n", (2 * Math.PI * r));
        System.out.printf("Dien tich hinh tron la: %.2f ", (Math.PI * (r * r)));
    }
}
