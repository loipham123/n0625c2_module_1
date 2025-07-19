package phuong_thuc;

import java.util.Scanner;

/**
 * Viết chương trình nhập thông tin của một nhân viên trong công ty. Thông tin cần nhập vào bao gồm: họ tên, tuổi, giới tính,
 * mức lương cơ bản, điểm trung bình tốt nghiệp đại học (theo thang điểm 10). Sau khi nhập xong thì in thông tin đã nhập ra.
 */
public class Bai6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        nhapThongTin();
        xuatThongTin();
    }

    static String hoTen;
    static int tuoi;
    static String gioiTinh;
    static double luongCB;
    static double diemTB;

    static void nhapThongTin() {
        System.out.print("Nhap Ho Ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap Tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap Gioi tinh: ");
        gioiTinh = sc.nextLine();

        System.out.print("Nhap vao muc luong: ");
        luongCB = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap diem TB: ");
        diemTB = Double.parseDouble(sc.nextLine());
    }

    static void xuatThongTin() {
        System.out.println("Ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Luong CB: " + luongCB);
        System.out.println("Diem TB: " + diemTB);
    }
}
