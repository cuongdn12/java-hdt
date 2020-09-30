/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.Scanner;
import model.DaySo;

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
        DaySo a = null;
        while (true) {
            System.out.println("1. Nhập vào 1 dãy số nguyên");
            System.out.println("2. Đưa ra tổng");
            System.out.println("3. Đưa ra trung bình");
            System.out.println("4. Đưa ra giá trị lớn nhất, nhỏ nhất");
            System.out.println("5. Đưa ra các số nguyên tố");
            System.out.println("0. Thoát chương trình");
            System.out.print("Chọn tu 0->3: ");
            Scanner in = new Scanner(System.in);
            int chose = Integer.parseInt(in.nextLine());
            switch (chose) {

                case 1:
                    a = new DaySo();
                    a.setArr();

                    break;
                case 2:
                    System.out.println("Tổng của dãy số: " + a.tong());
                    break;
                case 3:
                    System.out.println("Trung bình: " + a.trungBinh());
                    break;
                case 4:
                    a.min_max();
                    break;
                            
                case 5:
                    a.NT();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

}
