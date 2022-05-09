package ThucHanh;

import java.util.Scanner;

public class Th3_DienTichHinhChuNhat {
    public static void main(String[] args) {
        double chieuDai;
        double chieuRong;

        Scanner input = new Scanner(System.in);
        System.out.println(" Nhập chiều dài: ");
        chieuDai = input.nextDouble();

        System.out.println("Nhập chiều rộng: ");
        chieuRong = input.nextDouble();

        double dienTichHinhChuNhat = chieuDai * chieuRong;
        System.out.println("Chiều dài là: "+ chieuDai);
        System.out.println("Chiều rộng là"+ chieuRong);
        System.out.println("Diện tích hình chữ nhật là: " + dienTichHinhChuNhat);
    }
}
