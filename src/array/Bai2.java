package array;

import java.util.Scanner;

/**
 * Sử dụng các mảng 1 chiều để xử lý bài nhập thông tin cho n nhân viên ở bài trước.
 */
public class Bai2 {
    public static void main(String[] args) {
        String chose;

        do {
            nhapThongTin(soLuongNV);
            soLuongNV++;
            System.out.println("Nhap YES de tiep tuc, NO de dung lai");
            chose = sc.nextLine();
        } while (chose.equalsIgnoreCase("yes") || chose.equalsIgnoreCase("y"));

        for (int i = 0; i < soLuongNV; i++) {
            System.out.println("Thong tin nhan vien thu " + (i + 1));
            xuatThongTin(i);
        }
    }

    static Scanner sc = new Scanner(System.in);

    static String[] hoTen = new String[5];
    static int[] tuoi = new int[5];
    static String[] gioiTinh = new String[5];
    static double[] mucLuong = new double[5];
    static double[] diemTBTN = new double[5];
    static int soLuongNV = 0;

    static void nhapThongTin(int index) {
        System.out.print("Nhap Ho Ten: ");
        hoTen[index] = sc.nextLine();

        System.out.print("Nhap Tuoi: ");
        tuoi[index] = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap Gioi tinh: ");
        gioiTinh[index] = sc.nextLine();

        System.out.print("Nhap vao muc luong: ");
        mucLuong[index] = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap diem TBTN: ");
        diemTBTN[index] = Double.parseDouble(sc.nextLine());
    }

    static void xuatThongTin(int index) {
        System.out.println("Ten: " + hoTen[index]);
        System.out.println("Tuoi: " + tuoi[index]);
        System.out.println("Gioi tinh: " + gioiTinh[index]);
        System.out.println("Luong CB: " + mucLuong[index]);
        System.out.println("Diem TB: " + diemTBTN[index]);
    }
}
