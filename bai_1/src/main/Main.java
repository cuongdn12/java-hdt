/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import thuoc_tinh.So_n;

/**
 *
 * @author dangngoccuong
 */
public class Main {

    public static void main(String[] args) {
        So_n so1 = new So_n();
        while (true) {
            System.out.println("1. Nhập vào số nguyên dương n");
            System.out.println("2. Viết ra tổng 1+2+3+...+n");
            System.out.println("3. Viết ra tích 1.2.3...n");
            System.out.println("4. Viết ra tổng 2+4+....");
            System.out.println("5. Viết ra tổng 1+3+5+...");
            System.out.println("6. Viết ra các số nguyên tố <n");
            System.out.println("7. Viết ra dãy số Fibonacci <n");
            System.out.println("8. Viết tổng các chữ số của n (345: 3+4+5)");
            System.out.println("9. Viết các ước của n");
            System.out.println("0. Thoát chương trình");
            Scanner in = new Scanner(System.in);
            int chose;
            System.out.print("chon tu 0->9: ");
            chose = Integer.parseInt(in.nextLine());
            switch (chose) {
                case 0:
                    System.exit(0);
                case 1:
                    so1.nhap();
                    break;
                case 2:
                    so1.tong();
                    break;
                case 3:
                    so1.tich();
                    break;
                case 4:
                    so1.tong_chan();
                    break;
                case 5:
                    so1.tong_le();
                    break;
                case 6:
                    so1.so_nt();
                    break;
                case 7:
                    so1.fibonaci();
                    break;
                case 8:
                    so1.tong_n();
                    break;
                case 9:
                    so1.uoc_n();
                    break;

            }
        }
    }

}
