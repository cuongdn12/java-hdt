/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lietke;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class NhiPhan {

    private int n;

    private void quaylui(int i, int n, int x[]) {
        for (int j = 0; j < 2; j++) {
            x[i] = j;
            if (i == n - 1) {
                System.out.println(Arrays.toString(x));
            } else {
                quaylui(i + 1, n, x);
            }
        }
    }

    public void lietkeNhiPhan() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = Integer.parseInt(in.nextLine());
        int[] x = new int[n];
        quaylui(0, n, x);
    }
}
