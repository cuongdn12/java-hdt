/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class phanSo {
    private String ps;
    private int tu, mau;
    private void nhap(){
        Scanner in=new Scanner(System.in);
        String re = "\\d+/\\d+";
        System.out.println("Nhap phan so:");
        while(true){
            this.ps = in.nextLine();
            if(ps.matches(re))
                break;
            else
                System.err.println("Nhap sai !!!\nNhap lai: ");
        }
        String[] arr= ps.split("/");
        this.tu=Integer.parseInt(arr[0]);
        this.mau=Integer.parseInt(arr[1]);
        
    }
    private void rutGon(phanSo a){
        int x=a.tu, y=a.mau;
        while(x!=y){
            if(x>y) x-=y;
            else y-=x;
        }
        a.tu/=x;
        a.mau/=x;
    }
    public void hienthi(){
        rutGon(this);
        if(this.mau==1)
            System.out.println(this.tu);
        else System.out.println(this.tu+"/"+this.mau);
    }
    public  void tong(){
        phanSo x =new phanSo();
        x.nhap();
        this.nhap();
        phanSo tmp = new phanSo();
        tmp.tu =this.tu*x.mau+this.mau*x.tu;
        tmp.mau =this.mau*x.mau;
        tmp.hienthi();
    }
}
