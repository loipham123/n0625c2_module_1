package array;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Bai1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap vao so luong phan tu cua mang: ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("So luong cua mang phai la so duong, vui long nhap lai!!!");
            }
        } while (n < 0);

        int[] arr = new int[n];

        inputArr(arr);
        outputArr(arr);

        if (isAllEven(arr)) {
            System.out.println("Mang toan chan");
        } else {
            System.out.println("Mang khong toan chan");
        }

        System.out.println("Tong cac so duong le: " + calculateSumPositiveOdd(arr));

        int x = 2;
        int index = lastIndexOf(arr, x);
        if (index == -1) {
            System.out.println("Khong tim thay phan tu x o trong mang");
        } else {
            System.out.println("X nam o vi tri index: " + index);
        }

        if (isAllPrime(arr)) {
            System.out.println("Mang toan so nguyen to");
        } else {
            System.out.println("Mang khong toan so nguyen to");
        }

        //Cau c Mang tang dan?
        if (isAscending(arr)) {
            System.out.println("La mang tang dan");
        } else {
            System.out.println("Khong la mang tang dan");
        }

        //3.a.Đếm số lượng phần tử lẻ có trong mảng a.
        System.out.println("So luong phan tu le trong mang la: " + countOddElements(arr));

        //3.b.Tính tổng số dương lẻ của mảng a.
        System.out.println("Tong so duong le cua mang la: " + sumPositiveOdd(arr));

        //3.c.Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5.
        System.out.println("So chia het cho 4 nhung khong chia het cho 5 la: " + countDivisibleBy4NotBy5(arr) + " so");

        //3.d.Tổng các số nguyên tố có trong mảng
        System.out.println("Tong so nguyen to trong mang: " + sumPrimes(arr));

        //4.b.Vị trí số nguyên tố đầu tiên trong mảng nếu có
        System.out.println("Vi tri so nguyen to dau tien trong mang neu co:");
        int firstPrimeIndex = firstPrimeIndex(arr);
        if (firstPrimeIndex == -1) {
            System.out.println("Khong tim thay so nguyen to trong mang");
        } else {
            System.out.println("Vi tri xuat hien so nguyen to dau tien: " + firstPrimeIndex);
        }

        //4.c.Tìm số dương nhỏ nhất trong mảng
        System.out.println("4.c.Tìm số dương nhỏ nhất trong mảng");
        int minPositive = findMinPositive(arr);
        if (minPositive == -1) {
            System.out.println("Khong tim thay so duong");
        } else {
            System.out.println("Gia tri duong nho nhat o trong mang: " + minPositive);
        }

        //4.d.Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng
        System.out.println("4d.Cac vi tri cua k trong mang");
        System.out.print("Nhap k de tim: ");
        int k = scanner.nextInt();
        findElementInArray(arr, k);

        //4e.Tìm giá trị lớn nhất và nhỏ nhất của mảng a.
        System.out.println("Tìm giá trị lớn nhất và nhỏ nhất của mảng a.");
        System.out.println("Gia tri nho nhat cua mang: "+findMin(arr));
        System.out.println("Gia tri lon nhat cua mang: "+findMax(arr));
    }

    //Nhap mang
    private static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao arr [%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }

    //Xuat mang
    private static void outputArr(int[] arr) {
        for (int item : arr) {
            System.out.println(item + "\t");
        }
    }

    static boolean isAllEven(int[] arr) {
        for (int item : arr) {
            if (item % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    static int calculateSumPositiveOdd(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            if (item > 0 && item % 2 != 0) {
                sum += item;
            }
        }
        return sum;
    }

    //4.a.Vị trí cuối cùng của phần tử x trong mảng
    static int lastIndexOf(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //Kiem tra so nguyen to
    static boolean isAllPrime(int[] arr) {
        for (int item : arr) {
            if (!isPrime(item)) {
                return false;
            }
        }
        return true;
    }

    //so nguyen to
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //c.Mang tang dan?
    static boolean isAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    //3.a.Đếm số lượng phần tử lẻ có trong mảng a.
    static int countOddElements(int[] arr) {
        int count = 0;
        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    //3.b.Tính tổng số dương lẻ của mảng a.
    static int sumPositiveOdd(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            if (item > 0 && item % 2 != 0) {
                sum += item;
            }
        }
        return sum;
    }

    //3.c.Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5.
    static int countDivisibleBy4NotBy5(int[] arr) {
        int count = 0;
        for (int item : arr) {
            if (item % 4 == 0 && item % 5 != 0) {
                count++;
            }
        }
        return count;
    }

    //3.d.Tổng các số nguyên tố có trong mảng
    static int sumPrimes(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            if (isPrime(item)) {
                sum += item;
            }
        }
        return sum;
    }

    //4.b.Vị trí số nguyên tố đầu tiên trong mảng nếu có
    static int firstPrimeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    //4.c.Tìm số dương nhỏ nhất trong mảng
    static int findMinPositive(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int item : arr) {
            if (item > 0 && item < min) {
                min = item;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    //4.d.Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng
    static void findElementInArray(int[] arr, int k) {
        boolean found = false;
        System.out.println("vi tri cua " + k + " trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay" + k + " trong mang");
        }
        System.out.println();
    }

    //4e.Tìm giá trị lớn nhất và nhỏ nhất của mảng a.
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    //Tim max
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


}
