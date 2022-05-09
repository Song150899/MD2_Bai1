package ThucHanh;

import java.util.Scanner;

public class Th6_TinhNamNhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nam;
        System.out.println("Nhập năm bạn muốn kiểm tra:");
        nam = input.nextInt();
        boolean namNhuan = false;

        boolean namChiaHetCho4 = nam % 4 == 0;
        if (namChiaHetCho4) {
            boolean namChiaHetCho100 = nam % 100 == 0;
            if (namChiaHetCho100 ) {
                boolean namChiaHetCho400 = nam % 400 == 0;
                if (namChiaHetCho400) {
                    namNhuan = true;
                }
            } else {
                namNhuan = false;
            }
        }
        if (namNhuan) {
            System.out.println("Năm" + nam + "Là năm nhuận");
        } else {
            System.out.println("Năm" + nam + "Không là năm nhuận");
        }
    }
}