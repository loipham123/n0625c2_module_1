package java_overview;

import java.util.Scanner;

/**
 * Nhập vào số xe của bạn (Gồm tối đa 5 chữ số). Cho biết số xe của bạn được mấy nút?
 *
 * Ví dụ: Biển số xe bạn là: 12345 thì số nút là 5, do 1 + 2+ 3 + 4 + 5 = 15, nhưng số nút chỉ lấy hàng đơn vị nên sẽ là 5 nút (điểm).
 */
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so xe: ");
        int n = sc.nextInt(); // 12345
        int tong = n % 10; //5
        n = n / 10; // 1234
        tong = tong + n % 10; // 9
        n = n / 10; // 123

        tong = tong + n % 10; // 12
        n = n / 10; // 12

        tong = tong + n % 10; // 14
        n = n / 10; // 1

        tong = tong + n;

        System.out.println("Bien so xe co so nut la: " + (tong % 10));

    }
}
