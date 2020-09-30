/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class DaySo {

    private int[] a;

    public void setArr() {
        String s;
        System.out.print("Nhập dãy số: ");
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        String[] tmp = s.split(" ");
        a = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            a[i] = Integer.parseInt(tmp[i]);
        }

    }

    public int tong() {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public double trungBinh() {
        if (a.length == 0) {
            return 0;
        }
        return ((double) tong()) / a.length;
    }
}
