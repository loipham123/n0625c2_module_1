package array;

import java.util.Scanner;

public class Bai3 {
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

        System.out.println("Thong tin nhan vien co diem cao nhat");
        timDiemTBCaoNhat();

        System.out.println("Nhap vao ten can tim (chinh xac nhat)");
        String ten = sc.nextLine();
        timTheoHoTen(ten);

        System.out.println("Nhap vao ten can tim (gan chinh xac): ");
        String tenGanChinhXac=sc.nextLine();
        timTheoHoTenGanDung(tenGanChinhXac);

    }

    static Scanner sc = new Scanner(System.in);

    static String[] hoTen = new String[5];
    static int[] tuoi = new int[5];
    static String[] gioiTinh = new String[5];
    static double[] mucLuong = new double[5];
    static double[] diemTB = new double[5];
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

        System.out.print("Nhap diem TB: ");
        diemTB[index] = Double.parseDouble(sc.nextLine());
    }

    static void xuatThongTin(int index) {
        System.out.println("Ten: " + hoTen[index]);
        System.out.println("Tuoi: " + tuoi[index]);
        System.out.println("Gioi tinh: " + gioiTinh[index]);
        System.out.println("Luong CB: " + mucLuong[index]);
        System.out.println("Diem TB: " + diemTB[index]);
    }

    static void timDiemTBCaoNhat() {
        double max = diemTB[0];

        for (int i = 1; i < soLuongNV; i++) {
            if (max < diemTB[i]) {
                max = diemTB[i];
            }
        }
        //xuat thong tin
        for (int i = 0; i < soLuongNV; i++) {
            if (max == diemTB[i]) {
                xuatThongTin(i);
            }
        }
    }

    static void timTheoHoTen(String name) {
        for (int i = 1; i < soLuongNV; i++) {
            if (name.equals(hoTen[i])) {
                xuatThongTin(i);
            }
        }
    }

    static void timTheoHoTenGanDung(String name) {
        for (int i = 0; i < soLuongNV; i++) {
            if (hoTen[i].contains(name)) {
                xuatThongTin(i);
            }
        }
    }
}

