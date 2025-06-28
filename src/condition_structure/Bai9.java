package condition_structure;

import java.util.Scanner;

/**
 * Nhập vào 1 ký tự là chữ cái. Nếu nhập sai thì báo thông báo đã nhập sai. Nếu đúng thì đi kiểm tra nếu đó đang là chữ cái thường thì biến nó thành chữ cái hoa,
 * nếu nó là chữ cái hoa thì biến nó thành chữ cái thường. Gợi ý: Ký tự chữ cái thường và hoa có mã ASCII cách nhau 32 đơn vị. Vd: ‘a’ là 97, ‘A’ là 65
 */
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao ky tu: ");
        char kyTu = sc.next().charAt(0);

        if ((kyTu >= 'A' && kyTu <= 'Z') || (kyTu >= 'a' && kyTu <= 'z')) {
            if (kyTu >= 'a' && kyTu <= 'z') {
                kyTu -= 32;
            } else {
                kyTu += 32;
            }
            System.out.println("Ky tu sau khi chuyen doi: " + kyTu);
        } else {
            System.out.println("Sai ky tu!!");
        }


    }
}
