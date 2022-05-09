package BaiTap;


import java.util.Scanner;

class Bt2_NumberToLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Nhập số bạn muốn đoc:");
        int so = input.nextInt();


        switch (so / 10) {
            case 0:
                System.out.print(" không");
                break;
            case 11:
                System.out.print(" mười một");
                break;

            case 12:
                System.out.print(" mười hai");
                break;

            case 13:
                System.out.print(" mười ba");
                break;

            case 14:
                System.out.print(" mười bốn");
                break;
            case 15:
                System.out.print(" mười lăm");

                break;
            case 16:
                System.out.print(" mười sáu");

                break;
            case 17:
                System.out.print(" mười bảy");

                break;
            case 18:
                System.out.print(" mười tám");

                break;
            default:
                switch (so / 10) {
                    case 2:
                        System.out.println("Hai mươi");
                        break;
                    case 3:
                        System.out.println("Ba mươi");
                        break;

                    case 4:
                        System.out.println("Bốn mươi");
                        break;

                    case 5:
                        System.out.println("Năm mươi");
                        break;

                    case 6:
                        System.out.println("Sáu mươi");
                        break;

                    case 7:
                        System.out.println("Bảy mươi");
                        break;

                    case 8:
                        System.out.println("Tám mươi");
                        break;

                    case 9:
                        System.out.println("Chín mươi");
                        break;
                    default:
                        switch (so/100){

                            case 1:
                                System.out.println(" Một trăm");
                                break;
                            case 2:
                                System.out.println("Hai trăm");
                                break;
                            case 3:
                                System.out.println("Ba trăm");
                                break;
                            case 4:
                                System.out.println("Bốn trăm");
                                break;
                            case 5:
                                System.out.println("Năm trăm");
                                break;
                            case 6:
                                System.out.println("Sáu trăm");
                                break;
                            case 7:
                                System.out.println("Bảy trăm");
                                break;
                            case 8:
                                System.out.println("Tám trăm");
                                break;
                            case 9:
                                System.out.println("Chín trăm");
                                break;


                        }

                }
                switch (so%10){
                    case 1:
                        System.out.println("Một");
                        break;
                    case 2:
                        System.out.println("Hai");
                        break;
                    case 3:
                        System.out.println("Ba");
                        break;
                    case 4:
                        System.out.println("Bốn");
                        break;
                    case 5:
                        System.out.println("Năm");
                        break;
                    case 6:
                        System.out.println("Sáu");
                        break;
                    case 7:
                        System.out.println("Bảy");
                        break;
                    case 8:
                        System.out.println("Tám");
                        break;
                    case 9:
                        System.out.println("Chín");
                        break;
                }
        }
    }
}
