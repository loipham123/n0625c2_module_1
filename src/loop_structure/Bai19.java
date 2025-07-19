package loop_structure;

import java.util.Scanner;

/**
 * Viết chương nhập vào một số nguyên dương n. Sau đó quy đổi n ra hệ nhị phân.
 */
public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so thap phan: ");
        int n= sc.nextInt();
        String binary = "";

        while (n > 0){
            binary = n % 2 +binary;
            n =n /2;
        }
        System.out.println(binary);
    }
}
