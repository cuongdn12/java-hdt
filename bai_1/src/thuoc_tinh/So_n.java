/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuoc_tinh;

import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class So_n {

    private int n = 0;

    public void nhap() {
        Scanner in = new Scanner(System.in);
        System.out.print("nhap n:");
        n = Integer.parseInt(in.nextLine());
    }

    public void tong() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void tich() {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        System.out.println(s);
    }

    public void tong_chan() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public void tong_le() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private boolean ktra_nt(int j) {
        for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void so_nt() {
        for (int i = 2; i < n; i++) {
            if (ktra_nt(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    public void fibonaci() {
        int fb1 = 1, fb2 = 2, fb = 0;
        while (fb1 < n) {
            System.out.print(fb1 + " ");
            fb = fb1;
            fb1 = fb2;
            fb2 = fb + fb2;
        }
        System.out.println("");
    }

    public void tong_n() {
        int s = 0;
        String m = Integer.toString(n);
        char[] p = m.toCharArray();
        for (int i = 0; i < p.length; i++) {
            s += Integer.parseInt(String.valueOf(p[i]));
        }
        System.out.println(s);
    }

    public void uoc_n() {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

}
