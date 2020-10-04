/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.PTGT;
import entity.XeTai;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class DanhSach {
    private List<PTGT> list;
    private Scanner in;
    public DanhSach(){
        list=new ArrayList<>();
        in=new Scanner(System.in);
    }
    private PTGT nhap(){
        //hãng sản xuất, năm sản xuất, giá bán, màu.
        String hang,mau;
        int nam;
        double gia;
        System.out.print("Hang:");
        hang=in.nextLine();
        System.out.print("nam:");
        nam=Integer.parseInt(in.nextLine());
        System.out.print("gia:");
        gia=Double.parseDouble(in.nextLine());
        System.out.print("mau:");
        mau=in.nextLine();
        return new PTGT(hang, nam, gia, mau);
    }
    public void nhapXeTai(){
        PTGT p=nhap();
        
        System.out.print("Trong tai:");
        double trongtai=Double.parseDouble(in.nextLine());
        XeTai x=new XeTai(p.getHang(),p.getNam(),
                p.getGia(), p.getMau(), trongtai);
        list.add(x);
    }   
    public void viet(){
        System.out.println("Hang\tNam\tGia\tMau\tTrongtai");
        for(PTGT p:list)
          if(p instanceof XeTai)
            System.out.println(p.toString());
    }
    
}
