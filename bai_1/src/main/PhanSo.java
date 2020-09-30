/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class PhanSo {
    private Integer tuso = new Integer(0);
    private Integer mauso = new Integer(1);
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        
        this.tuso = Integer.parseInt(input.nextLine());
        this.mauso = Integer.parseInt(input.nextLine());
    }
    
    public int ucln(Integer a, Integer b){
        if(b==0) return a;
        return ucln(b,a%b);
    }
    
    public void rutGon(){
        Integer sochia = new Integer(ucln(this.tuso, this.mauso));
        
        this.tuso/=sochia;
        this.mauso/=sochia;
    }
    
    public void tong(PhanSo them){
        this.tuso = this.tuso*them.mauso + them.tuso*this.mauso;
        this.mauso = this.mauso*them.mauso;
        
        rutGon();
    }
    
    public void hieu(PhanSo them){
        this.tuso = this.tuso*them.mauso - them.tuso*this.mauso;
        this.mauso = this.mauso*them.mauso;
        
        rutGon();
    }
    
    public void tich(PhanSo them){
        this.tuso = this.tuso*them.tuso;
        this.mauso = this.mauso*them.mauso;
        
        rutGon();
    }
    
    public void thuong(PhanSo them){
        this.tuso = this.tuso*them.mauso;
        this.mauso = this.mauso*them.tuso;
        
        rutGon();
    }
    
    public void in(){
        System.out.println(this.tuso+"/"+this.mauso);
    }
    

}
