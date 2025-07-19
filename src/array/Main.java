package array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a=new int[3];
        int[] b=a;
        changeData(b);
        System.out.println(Arrays.toString(a));
    }
    static void changeData(int[] arr){
        arr[0]=10;
        arr[1]=20;
        arr =  new int[3];
        arr[2]=30;
    }
}
