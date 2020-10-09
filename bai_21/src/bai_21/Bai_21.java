/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_21;

import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class Bai_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n,x;
        System.out.print("Nhap bac da thuc n=");
        n= Integer.parseInt(in.nextLine());
        int[] a = new int[n+1];
        for (int i = 0; i <= n; i++) {
            System.out.print("nhap he so cua x^"+i+": ");
            a[i]=Integer.parseInt(in.nextLine());
        }
        System.out.print("Nhap x: ");
        x= Integer.parseInt(in.nextLine());
        int sum = 0;
        sum=a[n];
        for(int i=n; i>0; i--){
            sum=sum*x + a[i-1];
        }
        System.out.println(sum);
    }
    
}
