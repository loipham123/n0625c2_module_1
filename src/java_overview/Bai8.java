package java_overview;

/**
 * Kết quả của các dòng lệnh sau là gì:
 *
 * int i = 2;
 * System.out.println(i++);
 * System.out.println(++i);
 */
public class Bai8 {
    public static void main(String[] args) {
        int i= 2;
        System.out.println(i++);//i=3
        System.out.println(++i);//i=4
    }
}
