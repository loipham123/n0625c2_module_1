package phuong_thuc;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = sc.nextInt();

        System.out.println("So dao: " + reversedNumber(n));

        if (isSymmetricalNumber(n)) {
            System.out.printf("%d la so doi xung\n", n);
        } else {
            System.out.printf("%d khong phai la so doi sung\n", n);
        }

        System.out.println("Cau c");
        if (isSquareNumber(n)) {
            System.out.printf("%d la so chinh phuong\n", n);
        } else {
            System.out.printf("%d khong la so chinh phuong\n", n);
        }

        System.out.println("Cau d");
        if (isPrimeNumber(n)) {
            System.out.printf("%d la so nguyen to\n", n);
        } else {
            System.out.printf("%d khong la so nguyen to\n", n);
        }

        System.out.println("Cau e");
        System.out.printf("Tong cac so le cua %d: %d\n", n, calculateTotalOddDigits(n));

        System.out.println("Cau f");
        System.out.printf("Tong cac so nguyen to cua %d: %d\n", n, calculateTotalPrimeDigits(n));

        System.out.println("Cau g");
        System.out.printf("Tong so chinh phuong cua %d: %d\n",n,calculateTotalSquareDigits(n));
    }

    static int reversedNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    static boolean isSymmetricalNumber(int number) {
        return number == reversedNumber(number);
    }

    //c.So chinh phuong
    static boolean isSquareNumber(int number) {
        return Math.sqrt(number) % 1 == 0;
    }

    //d.So nguyen to
    static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //e.Tong so le
    static int calculateTotalOddDigits(int number) {
        int total = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                total += digit;
            }
            number /= 10;
        }
        return total;
    }

    //f.Tong cac so nguyen to
    static int calculateTotalPrimeDigits(int number) {
        int total = 0;
        while (number != 0) {
            int digit = number % 10;
            if (isPrimeNumber(digit)) {
                total += digit;
            }
            number /= 10;
        }
        return total;
    }

    //g.Tong so chinh phuong
    static int calculateTotalSquareDigits(int number) {
        int total = 0;
        while (number != 0) {
            int digit = number % 10;
            if(isSquareNumber(digit)){
                total+=digit;
            }
            number/=10;
        }
        return total;
    }
}

