/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.Scanner;
import model.SinhVien;

/**
 *cuondang  dang ngoc
 * 
 * @author dangngoccuong
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        SinhVien sv = new SinhVien();
        sv.sethT();
        sv.setsDT();
        sv.setmSV();
        sv.getSV();
    }

}
