package ThucHanh;

import java.util.Scanner;

public class Th5_TinhNgayTrongThang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Nhập tháng mà bạn muốn đếm ngày: ");
        int thang = input.nextInt();
        String soNgayTrongThang;
        switch (thang) {
            case 1:
                System.out.println(" Tháng " + thang + "Có 31 ngày ");

            case 2:
                System.out.println(" Tháng 2 có 28 hoặc 29 ngày ");

            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgayTrongThang = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgayTrongThang = "30";
                break;
            default:
                soNgayTrongThang = "";
        }
        if (!soNgayTrongThang.equals("")) {
            System.out.printf("Tháng " + thang + " có " + soNgayTrongThang +" ngày");

        } else {
            System.out.println(" Nhập lại tháng mà bạn muốn đếm");
        }
    }
}
