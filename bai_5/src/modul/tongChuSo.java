/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class tongChuSo {

    private int so;

    public void tongSo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen: ");
        so = Integer.parseInt(in.nextLine());
        String s = String.valueOf(so);
        String[] arr = s.split("");
        int sum = 0;
        for (String i : arr) {
            sum += Integer.parseInt(i);
        }
        System.out.println("tong cac chu so la: " + sum);
    }
}
