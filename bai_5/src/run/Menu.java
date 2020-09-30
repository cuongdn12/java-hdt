/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.Scanner;
import modul.soNT;
import modul.tongChuSo;
import modul.ucln_bcnn;

/**
 *
 * @author dangngoccuong
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ucln_bcnn uc_bc = new ucln_bcnn();
        tongChuSo tong_chuso = new tongChuSo();
        soNT So_n = new soNT();
        while (true) {
            int chose;
            Scanner in = new Scanner(System.in);
            System.out.println("1. Ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên a và b");
            System.out.println("2. Tổng các chữ số của một số nguyên");
            System.out.println("3. Phân tích một số nguyên thành các thừa số nguyên tố");
            System.out.println("4. Liệt kê tất cả các số nguyên tố nhỏ hơn n");
            System.out.println("5. Liệt kê m số nguyên tố đầu tiên.");
            System.out.println("0. Thoát chương trình.");
            System.out.print("Chọn từ 1->n:");
            chose = Integer.parseInt(in.nextLine());

            switch (chose) {
                case 1:
                    uc_bc.ucln_bcnn();
                    break;
                case 2:
                    tong_chuso.tongSo();
                    break;
                case 3:
                    So_n.ptSoNT();
                    break;
                case 4:
                    So_n.lietKe();
                    break;
                case 5:
                    So_n.nSoNT();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

}
