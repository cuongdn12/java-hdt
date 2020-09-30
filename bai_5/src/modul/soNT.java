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
public class soNT {

    private int so, n, m;

    private boolean isNT(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void ptSoNT() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen: ");
        so = Integer.parseInt(in.nextLine());
        int i = 2, x = so;
        while (true) {
            if (isNT(i) && (x % i == 0)) {
                if (x == i) {
                    System.out.println(i);
                    break;
                }
                x /= i;
                System.out.print(i + "x");
                continue;
            }
            i++;
        }
    }
    public void lietKe(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = Integer.parseInt(in.nextLine());
        for (int i = 2; i < n; i++) {
            if(isNT(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }
    public void nSoNT(){
        int dem=1, i=2;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap m: ");
        m = Integer.parseInt(in.nextLine());
        while(dem<=m){
            if(isNT(i)){
                System.out.print(i+" ");
                dem++;
            }
            i++;
        }
        System.out.println();
    }
}
