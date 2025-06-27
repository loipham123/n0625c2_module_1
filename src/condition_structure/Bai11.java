package condition_structure;

import java.util.Scanner;

/**
 * Nhập vào thông tin 1 ngày (ngày - tháng - năm). Kiểm tra ngày có hợp lệ hay không ?
 * Nếu hợp lệ hãy tìm ra ngày kế tiếp (ngày - tháng - năm) & ngày trước đó (ngày - tháng - năm).
 */
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ngay: ");
        int day = sc.nextInt();

        if (day < 1 || day > 31) {
            System.out.println("Ngay khong hop le");
            return;
        }

        System.out.println("Nhap thang: ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Thang khong hop le");
            return;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                System.out.println("Ngay khong hop le!!");
                return;
            }
        }

        System.out.println("Nhap nam: ");
        int year = sc.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (month == 2) {
            if (isLeapYear) {
                if (day > 29) {
                    System.out.println("Ngay khong hop le");
                    return;
                }
            } else {
                if (day > 28) {
                    System.out.println("Ngay khong hop le");
                    return;
                }
            }
        }
        System.out.println("Ngay hop le!!");
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        nextDay++;

        if (nextDay > 31 || (month == 2 && nextDay > (isLeapYear ? 29 : 28)) || ((month == 4 || month == 6 || month == 9 || month == 11) && nextDay > 30)) {
            nextDay = 1;
            nextMonth++;
        }
        //nam moi
        if (month > 12) {
            nextMonth = 1;
            nextYear++;
        }

        System.out.printf("Ngay ke tiep: %d/%d/%d", nextDay, nextMonth, nextYear);

        //Ngay truoc do
        int previousDay = day;
        int previousMonth = month;
        int previousYear = year;

        previousDay--;

        if (previousDay < 1) {
            previousDay--;
            if (previousDay < 1) {
                previousMonth = 12;
                previousYear--;
            }
        }
        if (previousDay == 4 || previousDay == 6 || previousDay == 9 || previousDay == 11) {
            previousDay = 30;
        } else if (previousDay == 2) {
            if (isLeapYear) {
                previousDay = 29;
            } else {
                previousDay = 28;
            }
        } else {
            previousDay = 31;
        }

        System.out.println();
        System.out.printf("Ngay truoc do: %d/%d/%d", previousDay, previousMonth, previousYear);
    }
}

