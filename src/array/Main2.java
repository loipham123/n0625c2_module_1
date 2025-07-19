package array;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder("Nguyen Ngoc Quang");

        changeData(str);
        System.out.println(str);
    }
    static void changeData(StringBuilder target){
        target.append(" - 1995 ");
    }
}
