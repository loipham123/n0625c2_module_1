package condition_structure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap diem cua ban: ");
        double score = sc.nextDouble();
        if (score < 0 || score > 10) {
            System.out.println("Diem khong hop le!!!");
        } else if (score < 4) {
            System.out.println("Rot mon");
        } else if (score < 6) {
            System.out.println("Trung Binh");
        } else if (score < 8) {
            System.out.println("Kha");
        } else {
            System.out.println("Gioi");
        }
    }
}
