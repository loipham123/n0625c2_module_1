package leetcode;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            System.out.print("Nhap phan tu arr[" + i + "]: ");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i =0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min =arr[i];
            }
        }
        System.out.println("Phan tu lon nhat: "+max);
        System.out.println("Phan tu nho nhat: "+min);
    }
}
