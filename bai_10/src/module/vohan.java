/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

/**
 *
 * @author dangngoccuong
 */
public class vohan {
    private double PI=0;
    public double tinh_PI(){
        double e = 0.00001,n=1.0,lPI=0;
        int i = 2;
        while(true){
            PI+=Math.pow(-1, i)* 1/n;
            if(Math.abs(lPI-PI)<=e)
                break;
            lPI=PI;
            n+=2.0;
            i++;
        }
        return PI;
    }
}
