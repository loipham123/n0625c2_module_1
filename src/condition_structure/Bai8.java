package condition_structure;

import java.util.Scanner;

/**
 * Nhập vào tháng & năm. Hãy cho biết tháng đó trong năm đó có bao nhiêu ngày.
 */
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thang: ");
        int month= sc.nextInt();
        System.out.print("Nhap nam: ");
        int year=sc.nextInt();
        int dayInMonth;

        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = 30;
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    dayInMonth = 29;
            }else{
                    dayInMonth = 28;
            }
                break;
            default:
                dayInMonth=31;
                break;
        }
        System.out.printf("So ngay trong thang %d cua nam %d la ngay %d",month,year,dayInMonth);

    }
}
