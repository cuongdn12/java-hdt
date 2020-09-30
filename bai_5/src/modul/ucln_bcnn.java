/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class ucln_bcnn {
    private int a,b;
    public void ucln_bcnn(){
        Scanner in = new Scanner(System.in);
        System.out.print("nhap so a: ");
        a=Integer.parseInt(in.nextLine());
        System.out.print("nhap so b: ");
        b=Integer.parseInt(in.nextLine());
        int c=a, d=b;
        while(c!=d){
            if(c>d) c-=d;
            else d-=c;
        }
        System.out.println("uoc chung lon nhat la: "+c);
        System.out.println("boi chung be nhat la "+(a*b)/c);
    }
}
