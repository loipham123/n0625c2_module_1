package condition_structure;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap day: ");
        int day = sc.nextInt();
//      Cach1
        switch (day) {
            case 2:
                System.out.println("Thu 2");
                break;
            case 3:
                System.out.println("Thu 3");
            case 4:
                System.out.println("Thu 4");
                break;
            case 5:
                System.out.println("Thu 5");
                break;
            case 6:
                System.out.println("Thu 6");
                break;
            case 7:
                System.out.println("Thu 7");
                break;
            default:
                System.out.println("Cuoi tuan");
        }
//       Cach 2
        switch (day) {
            case 2 -> System.out.println("Thu 2");
            case 3 -> System.out.println("Thu 3");
            case 4 -> System.out.println("Thu 4");
            case 5 -> System.out.println("Thu 5");
            case 6 -> System.out.println("Thu 6");
            case 7 -> System.out.println("Thu 7");
            default -> System.out.println("Cuoi tuan");
        }

    }
}
