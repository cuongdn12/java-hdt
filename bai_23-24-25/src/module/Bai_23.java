/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class Bai_23 {

    private int[] a;

    public void nhap() {
        System.out.print("Nhập dãy số: ");
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine().trim();
        String[] tmp = s.split(" ");
        a = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            a[i] = Integer.parseInt(tmp[i]);
        }
    }

    public int countElement(int a[], int n, int i) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (a[j] == i) {
                count++;
            }
        }
        return (count);
    }

    public void xuathien() {
        for (int i = 0; i < a.length; i++) {
            if (countElement(a, i, a[i]) == 0) {
                System.out.println("Phan tu " + a[i] + " xuat hien " + countElement(a, a.length, a[i]) + " lan");
            }
        }
    }

    public void xuathien1lan() {
        System.out.print("Cac phan tu trong day xuat hien 1 lan: ");
        for (int i = 0; i < a.length; i++) {
            if (countElement(a, a.length, a[i]) == 1) {
                System.out.print(" " + a[i]);
            }
        }
        System.out.println("");
    }

    public void xuathien2lan() {
        System.out.print("Cac phan tu trong day xuat hien 2 lan: ");
        for (int i = 0; i < a.length; i++) {
            if (countElement(a, a.length, a[i]) == 2 && countElement(a, i, a[i]) == 0) {
                System.out.print(" " + a[i]);
            }
        }
        System.out.println("");
    }
}
