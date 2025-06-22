package java_overview;

import java.util.Scanner;

/**
 * Nhập tên sản phẩm, số lượng và đơn giá. Tính tiền và thuế giá trị gia tăng phải trả, biết:
 * a. tiền = số lượng * đơn giá
 * b. thuế giá trị gia tăng = 10%
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        String tenSanPham= scanner.nextLine();

        System.out.println("Nhap so luong: ");
        double soLuong = scanner.nextDouble();

        System.out.println("Nhap vao gia: ");
        double donGia = scanner.nextDouble();

        System.out.println("Ten sam pham: " + tenSanPham);
        System.out.println("Thanh tien: " + (soLuong * donGia));
        System.out.println("Thue: " + (soLuong * donGia * 0.1));
    }
}
