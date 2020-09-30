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

    public void min_max() {
        int mi = Integer.MAX_VALUE, ma = Integer.MIN_VALUE;
        for (int i : a) {
            if (i > ma) {
                ma = i;
            }
            if (i < mi) {
                mi = i;
            }
        }
        System.out.println("so be nhat: " + mi);
        System.out.println("so lon nhat: " + ma);
    }

    private boolean isNT(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void NT() {
        for (int i : a) {
            if (isNT(i)&& i>=2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
