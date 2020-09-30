/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dangngoccuong
 */
public class SinhVien {
    private String hT, mSV, sDT;
    public SinhVien(String hT, String mSV, String sDT){
        this.hT=hT;
        this.mSV=mSV;
        this.sDT=sDT;
    }
    public SinhVien(){
        
    }
    public void sethT(){
            Scanner in=new Scanner(System.in);
            
            String regex ="^[a-zA-Z][a-zA-Z\\s]+\\S$";
            do{
                System.out.print("Nhap ho va ten: ");
                hT= in.nextLine();
            }
            while(!hT.matches(regex));
    }
    public void setmSV(){
            Scanner in=new Scanner(System.in);
            
            String regex ="^[bB]{1}\\d{2}DC(CN|AT|VT|DT)\\d{3}$";
  
            do{
                System.out.print("Nhap ma sinh vien: ");
                mSV= in.nextLine();
            }
            while(!mSV.matches(regex));
    }
    public void setsDT(){
            Scanner in=new Scanner(System.in);
            
            String regex ="\\d{10,11}";
            do{
                System.out.print("nhap so dien thoai: ");
                sDT= in.nextLine();
            }
            while(!sDT.matches(regex));
    }
    public getSV(){
        System.out.println(hT+"\t\t"+mSV+"\t"+sDT);
    }
}
