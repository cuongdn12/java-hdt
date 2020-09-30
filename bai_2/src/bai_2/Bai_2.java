/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2;

/**
 *
 * @author dangngoccuong
 */
import java.util.Scanner;
import thuoc_tinh.So_n_va_m;

public class Bai_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        So_n_va_m Q = new So_n_va_m();
        while (true) {
            System.out.println("1. Nhập vào 2 số nguyên m và n");
            System.out.println("2. Đưa ra ước chung lớn nhất và bộ chung nhỏ nhất");
            System.out.println("3. Đưa ra các số nguyên tố từ m đến n");
            System.out.println("4. Đưa ra các số thuận nghịch trong khoảng m-n");
            System.out.println("0. Thoát chương trình");
            System.out.print("Chọn từ 0 -> 4: ");
            Scanner in = new Scanner(System.in);
            int chose;
            chose = Integer.parseInt(in.nextLine());
            switch (chose) {
                case 0:
                    System.exit(0);
                case 1:
                    Q.nhap();
                    break;
                case 2:
                    Q.ucln_bcnn();
                    break;
                case 3:
                    Q.nt();
                    break;
                case 4:
                    Q.thuan_nghich();
                    break;
            }

        }
    }

}
