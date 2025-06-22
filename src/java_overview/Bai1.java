package java_overview;

import java.time.Year;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap nam sinh:");
        int yearOfBirth = scanner.nextInt();
        int currentYear = Year.now().getValue();
        System.out.println("tuoi cua ban la :" +(currentYear - yearOfBirth));
    }
}