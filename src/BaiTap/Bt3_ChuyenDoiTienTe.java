package BaiTap;

import java.util.Date;
import java.util.Scanner;

public class Bt3_ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double uSD;
        System.out.println("Nhập số tiền b muốn chuyển đổi");
        uSD = input.nextDouble();

        Double vNĐ = uSD*23000;
        System.out.println(" Số tiền Việt sau khi chuyển "+ uSD + " USĐ là: " + vNĐ);
    }



}
