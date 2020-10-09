/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lietke;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class HoanVi {
    
    private int n;
    private void quaylui(int i, int n, int x[], boolean check[]){
        for (int j = 1; j <= n; j++) {
           if(!check[j]){
               x[i]=j;
               check[j]=true;
               if(i==n){
                   for (int a=1; a<=n; a++) {
                       System.out.print(x[a]+" ");
                   }
                   System.out.println("");
               }
               else quaylui(i+1,n, x,check);
               check[j]=false;
           }
        }
    }
    public void lietkeHoanVi(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n:");
        n = Integer.parseInt(in.nextLine());
        int[] x = new int[n+1];
        boolean[] check = new boolean[n+1];
        for (boolean b : check) {
            b=false;
        }
        quaylui(1,n,x,check);
    }
}
