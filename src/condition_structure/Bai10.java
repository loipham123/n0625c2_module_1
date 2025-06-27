package condition_structure;

import java.util.Scanner;

/**
 * Kiểm tra 1 số nguyên dương x có phải là số chính phương hay không?
 * Định nghĩa số chính phương: Là số mà kết quả khai căn bậc 2 của nó là 1 số nguyên. vd: 0, 1, 4, 9, 16, 25, 36 ..
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap x: ");
        double x = sc.nextDouble();

        double squareRoot = Math.sqrt(x);

        if (squareRoot % 1 == 0) {
            System.out.println(x + " la so chinh phuong");
        } else {
            System.out.println(x + " khong phai la so chinh phuong!!");
        }
    }
}
