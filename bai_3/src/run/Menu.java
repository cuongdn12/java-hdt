/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

/**
 *
 * @author dangngoccuong
 */
import java.util.Scanner;
import entity.TamGiac;

public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TamGiac Q = new TamGiac();
        while (true) {
            System.out.println("1. Nhập vào 3 số a,b,c");
            System.out.println("2. Tìm nghiệm ax2 +bx+c");
            System.out.println("3. Tính diện tích của tam giác");
            System.out.println("4. Tính sin khi x=a");
            System.out.println("5. Tính cos khi x=b");
            System.out.println("6. Tính chu vi, diện tích hình hộp (kích thước axbxc)");
            System.out.println("0. Thoát chương trình");
            int chose;
            Scanner in = new Scanner(System.in);
            System.out.println("chọn từ 0->6: ");
            chose = Integer.parseInt(in.nextLine());
            switch (chose) {
                case 0:
                    System.exit(0);
                case 1:
                    Q.nhap();
                    break;
            }
        }

    }

}
