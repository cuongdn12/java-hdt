/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lietke;

import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class ToHop {
    private int k,n;
    
    private void quaylui(int i, int k, int n, int x[], boolean check[]){
        for (int j = 1; j <= n; j++) {
            if(!check[j]){
                x[i]=j;
                check[j]=true;
                if(i==k){
                    for (int l = 1; l <= k; l++) {
                        System.out.print(x[l]+" ");
                    }
                    System.out.println("");
                }
                else quaylui(i+1,k,n,x,check);
                check[j]=false;
            }
            
        }
    }
    
    public void lietkeToHop(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap k: ");
        k = Integer.parseInt(in.nextLine());
        System.out.print("Nhap n: ");
        n = Integer.parseInt(in.nextLine());
        int[] x= new int[k+1];
        boolean[] check = new boolean[n+1];
        for (boolean b : check) {
            b=false;
        }
        quaylui(1,k,n,x,check);
    }
}
