package java_overview;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nha tuoi :");
        int age = Integer.parseInt(scanner.nextLine());


        System.out.print("nhap ten :");
//      scanner.nextLine(); //clear du lieu
        String name = scanner.nextLine();


        System.out.println("ten :"+name);
        System.out.println("tuoi cua ban: "+age);
    }
}
