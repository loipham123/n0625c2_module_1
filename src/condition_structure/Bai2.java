package condition_structure;

import java.util.Scanner;

/**
 * Nhập vào 1 số tự nhiên từ 1 đến 10, sau đó in ra tiếng Anh của từ đó theo 2 cách:
 * Cách 1: Dùng if else-if.
 * Cách 2: Dùng switch case.
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so: ");
        int so = sc.nextInt();

        if (so < 0 || so > 10) {
            System.out.println("So khong hop le");
        }
          else if (so == 1) {
                System.out.println("One");
            } else if (so == 2) {
                System.out.println("Two");
            } else if (so == 3) {
                System.out.println("Three");
            } else if (so == 4) {
                System.out.println("Four");
            } else if (so == 5) {
                System.out.println("Five");
            } else if (so == 6) {
                System.out.println("Six");
            } else if (so == 7) {
                System.out.println("Seven");
            } else if (so == 8) {
                System.out.println("Eight");
            } else if (so == 9) {
                System.out.println("Nine");
            } else {
                System.out.println("Ten");
            }
        /**
//        cach2
        switch (so){
            case 1-> System.out.println("One");
            case 2-> System.out.println("Two");
            case 3-> System.out.println("Three");
            case 4-> System.out.println("Four");
            case 5-> System.out.println("Five");
            case 6-> System.out.println("Six");
            case 7-> System.out.println("Seven");
            case 8-> System.out.println("Eight");
            case 9-> System.out.println("Nine");
            default -> System.out.println("Ten");
        }
    }
         */
}
}
