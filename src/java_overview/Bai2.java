package java_overview;

import java.util.Scanner;

/**
 * Viết một chương trình Java để nhập vào hai số nguyên a và b từ người dùng. Sau đó, tính và hiển thị tổng, hiệu, tích và thương của hai số đó.
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap 2 so nguyen a va b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Tong a va b: " + (a + b));
        System.out.println("Hieu a va b: " + (a - b));
        System.out.println("Tich a va b: " + (a * b));
        System.out.println("Thuong a va b: " + ((double) a / b));
    }
}
