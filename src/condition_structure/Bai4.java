package condition_structure;

import java.util.Scanner;

/**
 * Nhập vào 2 số nguyên a, b. In ra màn hình kết quả số lớn nhất, nhỏ nhất.
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();

//        int max;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
        //Toan tu 3 ngoi
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
