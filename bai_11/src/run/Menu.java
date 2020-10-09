/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.Scanner;
import module.Vocung;

/**
 *
 * @author dangngoccuong
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vocung a = new Vocung();
        
        Scanner in = new Scanner(System.in);
        int choose;
        while(true){
            System.out.println("1. tinh sinx khi n-> vo cung: ");
            System.out.println("2. tinh cosx khi n-> vo cung: ");
            System.out.println("0, Thoat chuong trinh");
            System.out.print("Chon: ");
            choose = Integer.parseInt(in.nextLine());
            switch(choose){
                case 1:
                    a.sin_x();
                    break;
                case 2:
                    a.cos_x();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    
}
