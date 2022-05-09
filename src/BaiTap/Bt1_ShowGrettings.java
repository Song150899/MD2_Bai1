package BaiTap;

import java.util.Scanner;

public class Bt1_ShowGrettings {
    public static void main(String[] args) {
        Scanner grettings = new Scanner(System.in);

        System.out.println(" Hãy nhập tên của bạn: ");
        String name= grettings.nextLine();
        System.out.println("Xin chào, " + name);
    }
}
