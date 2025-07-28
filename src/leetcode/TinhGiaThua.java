package leetcode;

import java.util.Scanner;

public class TinhGiaThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n=sc.nextInt();
        int giaiThua=1;
        for(int i =1;i<=n;i++){
            giaiThua *=i;
        }
        System.out.println(giaiThua);
    }
}
