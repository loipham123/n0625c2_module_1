package leetcode;

import java.util.Scanner;

public class CountArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String s =sc.nextLine();
        int count =0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch != ' '){
                if(i==0 || s.charAt(i-1)==' '){
                    count++;
                }
            }
        }
        System.out.println("So luong tu trong chuoi la: "+count);
    }
}
