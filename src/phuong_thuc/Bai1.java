package phuong_thuc;

import java.util.Scanner;


public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ky tu chu Hoa: ");
        char n = sc.nextLine().charAt(0);

        System.out.println("Ky tu sau khi chuyen doi: " + toLowerCase(n));

        System.out.println("Phuong trinh Bac 1: ");
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();

        System.out.println("Nhap b: ");
        double b = sc.nextDouble();


        lelvelOne(a, b);

        System.out.println("Phuong trinh Bac 2: ");
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();
        lelvelTwo(a, b, c);


        System.out.print("Nhap d: ");
        int d = sc.nextInt();

        System.out.print("Gia tri nho nhat la: " + min((int) a, (int) b, (int) c, d));
    }

    static char toLowerCase(char a) {
        if ((a >= 'A' && a <= 'Z')) {
            a += 32;
        }
        return a;
    }

    static void lelvelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong tring vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co nghiem: " + (-a / b));
        }
    }

    static void lelvelTwo(double a, double b, double c) {
        if (a == 0) {
            lelvelOne(b, c);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem duy nhat: " + (-b / (2 * a)));
            } else {
                System.out.println("Phuong trinh co 2 nghiem phan biet x1= " + (-b - Math.sqrt(delta)) / (2 * a) + " x2= " + (-b + Math.sqrt(delta)) / (2 * a));
            }
        }
    }

    static int min(int a, int b, int c, int d) {
        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        int min3 = Math.min(min1, min2);

        return min3;
    }
}
