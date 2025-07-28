package leetcode;

import java.util.Scanner;

public class UCLNVaBCNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();

        System.out.println("UCLN la: "+timUCLN(a,b));
        System.out.println("BCNN la: "+timBCNN(a,b));
    }

    static int timUCLN(int a, int b) {
        int ucln = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (i % a == 0 && i % b == 0) {
                ucln = i;
            }
        }
        return ucln;
    }
    static int timBCNN(int a,int b){
        int bcnn=a*b;
        for(int i=Math.max(a,b);i<=a*b;i++){
            if(i % a==0 && i%b==0){
                bcnn=i;
            }
        }
        return bcnn;
    }
}
