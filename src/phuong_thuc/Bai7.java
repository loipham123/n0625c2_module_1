package phuong_thuc;

import java.util.Scanner;

/**
 * Viết chương trình nhập thông tin của n nhân viên trong công ty (n nhập vào từ bàn phím, n <= 5).
 * Thông tin cần nhập tương tự ở câu trên. Sau khi nhập xong thì in thông tin đã nhập ra.
 * Lưu ý: in ra n nhân viên cùng lúc, không phải nhập nhân viên nào in nhân viên đó ra luôn.
 */
public class Bai7 {
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
