package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap so luong phan tu mang: ");
            n=sc.nextInt();

            if(n < 0){
                System.out.println("Phai nhan so nguyen duong!!!");
            }
        }while (n < 0);
    }
    static void inputArrayList(ArrayList<Integer> arrayList,int n){
        for(int i =0;i<n;i++){
            System.out.printf("Nhap phan tu arr[%d]: ",i);
            arrayList.add(sc.nextInt());

        }
    }
}
