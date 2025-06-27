package condition_structure;

import java.util.Scanner;

/**
 * Viết chương trình tính lương của nhân viên dựa theo thâm niên công tác (TNCT) như sau:
 *
 *  Lương = hệ số * lương căn bản, trong đó lương căn bản là 650000 $.
 *
 * • Nếu TNCT < 12 tháng: hệ số = 1.92
 *
 * • Nếu 12 <= TNCT < 36 tháng: hệ số = 2.34
 *
 * • Nếu 36 <= TNCT < 60 tháng: hệ số = 3
 *
 * • Nếu TNCT >= 60 tháng: hệ số = 4.5
 */
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao TNCT: ");
        int TNCT = sc.nextInt();
        int luongCB = 650000;
        double heSo;

        if (TNCT < 12) {
            heSo = 1.92;
        } else if (TNCT < 36) {
            heSo = 2.34;
        } else if (TNCT < 60) {
            heSo = 3;
        } else {
            heSo = 4.5;
        }
        System.out.println("Luong: " + (heSo * luongCB));
    }
}