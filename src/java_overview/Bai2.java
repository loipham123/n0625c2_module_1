package java_overview;

import java.util.Scanner;

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
