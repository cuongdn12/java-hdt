/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuoc_tinh;

/**
 *
 * @author dangngoccuong
 */
import java.util.Scanner;

public class So_n_va_m {

    private int n = 0, m = 0;

    public void nhap() {
        Scanner in = new Scanner(System.in);
        System.out.print("nhap n: ");
        n = Integer.parseInt(in.nextLine());
        System.out.print("nhap m: ");
        m = Integer.parseInt(in.nextLine());
    }

    private int ucln() {
        int so1 = n, so2 = m;
        while (so1 != so2) {
            if (so1 > so2) {
                so1 = so1 - so2;
            } else {
                so2 = so2 - so1;
            }
        }
        return so1;
    }

    public void ucln_bcnn() {
        int uc = ucln();
        if (uc == 0) {
            System.out.println("0");
        } else {
            System.out.println(uc + " " + (n * m / uc));
        }
    }

    private boolean ktra_nt(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void nt() {
        int so1, so2;
        if (n > m) {
            so1 = m;
            so2 = n;
        } else {
            so1 = n;
            so2 = m;
        }
        for (int i = so1; i <= so2; i++) {
            if (ktra_nt(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    private boolean ktra_thuan_nghich(int a) {
        String s = Integer.toString(a);
        char[] q = s.toCharArray();
        int l = q.length;
        // 12321
        // 012345
        for (int i = 0; i < l / 2; i++) {
            if (q[i] != q[l - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public void thuan_nghich() {
        int so1, so2;
        if (n > m) {
            so1 = m;
            so2 = n;
        } else {
            so1 = n;
            so2 = m;
        }
        for (int i = so1; i <= so2; i++) {
            if (ktra_thuan_nghich(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

    }
}
