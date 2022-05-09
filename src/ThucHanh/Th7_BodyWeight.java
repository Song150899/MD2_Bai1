package ThucHanh;

import java.util.Scanner;

public class Th7_BodyWeight {
    public static void main(String[] args) {
        double canNang;
        double chieuCao;
        double bmi;
        Scanner input = new Scanner(System.in);

        System.out.println(" Nhập cân nặng của bạn ( Tính bằng kg) : ");
        canNang = input.nextDouble();

        System.out.println(" Nhập chiều cao của bạn ( Tính bằng m");
        chieuCao = input.nextDouble();

        bmi= canNang / Math.pow(chieuCao,2);

        if (bmi<18){
            System.out.println("Chỉ số cơ thể của bạn là: "+ bmi + "\n Bạn bị thiếu cân!");
        }else if (bmi<25){
            System.out.println("Chỉ số cơ thể của bạn là: "+ bmi + "\n Bạn Có trọng lượng cân đối! Hãy cố gắng duy trì");
        }else if (bmi<30){
            System.out.println("Chỉ số cơ thể của bạn là: "+ bmi + "\n Bạn bị thừa cân!");
        }else  {
            System.out.println("Chỉ số cơ thể của bạn là: "+ bmi + "\n Bạn bị béo phì");
        }
    }
}
