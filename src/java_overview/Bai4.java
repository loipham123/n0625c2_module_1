package java_overview;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao diem Toan: ");
        double diemToan = sc.nextDouble();
        System.out.print("Nhap he so  Toan: ");
        double hsToan= sc.nextDouble();

        System.out.print("Nhap vao diem Ly: ");
        double diemLy = sc.nextDouble();
        System.out.print("Nhap he so  Ly: ");
        double hsLy= sc.nextDouble();

        System.out.print("Nhap vao diem Hoa: ");
        double diemHoa = sc.nextDouble();
        System.out.print("Nhap he so  Hoa: ");
        double hsHoa= sc.nextDouble();

        double diemTB=(diemToan*hsToan+diemLy*hsLy+diemHoa*hsHoa)/(hsToan+hsLy+hsHoa);
        System.out.print("Diem trung binh cua ban la: " + diemTB);
    }
}
