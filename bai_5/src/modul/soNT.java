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

    private int so, n, m,s, p;

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
    private int tongCS(int x){
        String s=String.valueOf(x);
        String[] arr=s.split("");
        int sum=0;
        for (String string : arr) {
            sum+=Integer.parseInt(string);
        }
        return sum;
    }
    public void soNT_5cs(){
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap S: ");
        s=Integer.parseInt(in.nextLine());
        for (int i = 10000; i <= 99999; i++) {
            if(isNT(i)&&(tongCS(i)==s))
                System.out.print(i+" ");
        }
        System.out.println();
    }
    public void nt_fb(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap p: ");
        p = Integer.parseInt(in.nextLine());
        int f0=1, f1=1, fn=0;
        while(fn<p){
            fn=f0+f1;
            f0=f1;
            f1=fn;
            if(isNT(fn))
                System.out.print(fn+" ");
        }
        System.out.println();
    }
}
