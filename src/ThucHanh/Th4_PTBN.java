package ThucHanh;

import java.util.Scanner;

public class Th4_PTBN {
    public static void main(String[] args) {
        System.out.println(" Giải phương trình bậc nhất");
        System.out.println(" Cho phương trình bậc nhất a*x + b = 0, Vui lòng nhập hằng số: ");

        Scanner input = new Scanner(System.in);

        System.out.println(" Nhập a: ");
        double a = input.nextDouble();

        System.out.println(" Nhập b: ");
        double b = input.nextDouble();

        if (a != 0) {
            System.out.println(" Phương trình có 1 nghiệm duy nhất: " + -b / a);
        }
        else if (a==0 && b!=0){
            System.out.println(" Phương trình vô số nghiệm.");
        }else {
            System.out.println( " Phương trình vô nghiệm");
        }

    }
}
