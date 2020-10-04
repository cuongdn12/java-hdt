/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class XeTai extends PTGT{
    private double trongtai;
    public XeTai(){super();}
    public XeTai(String hang, int nam, double gia, 
                String mau,double trongtai){
        super(hang, nam, gia, mau);
        this.trongtai=trongtai;
    }

    public double getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(double trongtai) {
        this.trongtai = trongtai;
    }

    
    public String toString(){
        return super.toString()+"\t"+trongtai;
    }
}
