package loop_structure;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double score;
        do {
            System.out.print("Nhap diem: ");
            score = sc.nextDouble();
            if (score < 0 || score > 10) {
                System.out.println("diem khong hop le");
            }
        } while (score < 0 || score > 10);

        System.out.println("Diem: " + score);
    }
}
