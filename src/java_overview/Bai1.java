package java_overview;

import java.time.Year;
import java.util.Scanner;

/**
 * Nhập năm sinh của một người. Tính tuổi người đó.
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap nam sinh: ");
        int yearOfBirth = scanner.nextInt();

        int currentYear = Year.now().getValue();
        System.out.println("Tuoi cua ban la: " + (currentYear - yearOfBirth));
    }
}