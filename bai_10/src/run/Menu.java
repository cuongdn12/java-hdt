/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.Scanner;
import module.chuanHoa;
import module.phanSo;
import module.thuannghich;
import module.vohan;

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
        Scanner in = new Scanner(System.in);

        vohan PI = new vohan();
        thuannghich tn = new thuannghich();
        phanSo ps = new phanSo();
        phanSo ps1 = new phanSo();
        chuanHoa chuan_hoa = new chuanHoa();

        while (true) {
            int chose;
            System.out.println("1. Tính PI với sai số epsilon");
            System.out.println("2. Liệt kê các số thuận nghịch có  6 chữ số");
            System.out.println("3. Nhập 2 (hoặc 3) phân số, viết ra, tổng, hiệu, tích và thương");
            System.out.println("4. Nhập họ và tên");
            System.out.println("5. Nhập đoạn văn");
            System.out.println("0. Thoát chương trình");
            System.out.print("Chọn: ");
            chose = Integer.parseInt(in.nextLine());
            switch (chose) {
                case 1:
                    System.out.print("Gía trị PI là: " + PI.tinh_PI() * 4);
                    //PI.tinh_PI();
                    break;
                case 2:
                    tn.lietKe();
                    break;
                case 3:
                    ps.nhap();
                    ps1.nhap();
//                    System.out.print("Tổng là: ");
//                    ps.tong(ps1);
                    System.out.print("Hiệu là: ");
                    ps.hieu(ps1);
                    break;
                case 4:
                    chuan_hoa.nhap_hoten();
                    break;
                case 5:
                    chuan_hoa.doan_van();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

}
