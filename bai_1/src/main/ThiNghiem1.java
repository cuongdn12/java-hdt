/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author dangngoccuong
 */
public class ThiNghiem1 {
    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        
        PhanSo b = new PhanSo();
        
        a.nhap();
        a.in();
        b.nhap();
        
        System.out.print("a=");
        a.in();
        System.out.print("b=");
        b.in();
        
        a.tong(b);
        
        System.out.print("a=");
        a.in();
    }
}
