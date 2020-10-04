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
public class Oto extends PTGT{
    // kiểu động cơ, số chỗ ngỗi
    private String kieu;
    private int socho;
    public Oto(){
        super();
    }
    public Oto(String hang, int nam, 
            double gia, String mau,String kieu,int socho){
        super(hang, nam, gia, mau);
        this.kieu=kieu;
        this.socho=socho;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }
    public String toString(){
        return super.toString()+"\t"+kieu+"\t"+socho;
    }
}
