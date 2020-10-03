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
public class fibonaci {
    private  int n;
    public void fbn(){
        Scanner in= new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = Integer.parseInt(in.nextLine());
        int f0=1, f1=1, fn=0, i=2;
        while(i<=n){
            fn=f0+f1;
            f0=f1;
            f1=fn;
            i++;
        }
        System.out.println("Số fibonaci thứ "+n+"là: "+fn);
    }
    
}
