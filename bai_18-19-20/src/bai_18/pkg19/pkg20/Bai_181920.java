/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_18.pkg19.pkg20;

import java.util.Scanner;
import lietke.HoanVi;
import lietke.NhiPhan;
import lietke.ToHop;

/**
 *
 * @author dangngoccuong
 */
public class Bai_181920 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NhiPhan a = new NhiPhan();
        HoanVi b = new HoanVi();
        ToHop c = new ToHop();
        
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("1. Liet ke xau nhi phan do dai n:");
            System.out.println("2. Liet ke cac hoan vi tu 1->n:");
            System.out.println("3. Liet ke cac to hop k cua n:");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Chon: ");
            int choose;
            choose = Integer.parseInt(in.nextLine());
            switch (choose) {
                case 1:
                    a.lietkeNhiPhan();
                    break;
                case 2:
                    b.lietkeHoanVi();
                    break;
                case 3:
                    c.lietkeToHop();
                    break;
                case 0:
                    System.exit(0);
            }
        }
        
    }
    
}
