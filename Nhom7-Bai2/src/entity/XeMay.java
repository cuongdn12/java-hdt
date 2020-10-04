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
public class XeMay extends PTGT{
    private int congsuat;
    public XeMay(){super();}
    public XeMay(String hang, int nam, double gia, 
                String mau,int congsuat){
        super(hang, nam, gia, mau);
        this.congsuat=congsuat;
    }

    public int getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
    }
    public String toString(){
        return super.toString()+"\t"+congsuat;
    }
}
