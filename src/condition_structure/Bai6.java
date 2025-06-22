package condition_structure;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();


        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co nghiem = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem duy nhat x = " + (-b / (2 * a)));
            } else {
                System.out.println("Phuong tring co 2 nghiem phan biet x1 = " + (-b - sqrt(delta)) / (2 * a) + "x2 = " + (-b + sqrt(delta)) / (2 * a));
            }
        }
    }
}