package condition_structure;

import java.util.Scanner;

/**
 * Nhập vào 2 số nguyên, lưu vào 2 biến a và b. Sau đó, đảo giá trị của 2 biến này rồi xuất giá trị của chúng ra màn hình console.
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
//      Dung bien tam
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

//      Khong dung bien tam
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b= " + b);
    }
}
