/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.Scanner;
import module.thuannghich;
import module.vohan;

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
        Scanner in = new Scanner(System.in);
        
        vohan PI = new vohan();
        thuannghich tn=new thuannghich();
        
        while(true){
            int chose;
            System.out.println("1. Tính PI với sai số epsilon");
            System.out.println("2. Liệt kê các số thuận nghịch có  6 chữ số");
            System.out.println("0. Thoát chuwong trình");
            System.out.print("Chọn: ");
            chose = Integer.parseInt(in.nextLine());
            switch(chose){
                case 1:
                    System.out.print("Gía trị PI là: "+PI.tinh_PI()*4);
                    //PI.tinh_PI();
                    break;
                case 2:
                    tn.lietKe();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    
}
