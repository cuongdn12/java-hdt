/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_22;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class Bai_22 {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Nhập dãy số thứ nhất: ");
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        String[] tmp = s.split(" ");
        int[] a = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            a[i] = Integer.parseInt(tmp[i]);
        }
         System.out.print("Nhập dãy số thứ hai: ");
        s = in.nextLine();
        String[] tmp1 = s.split(" ");
        int[] b = new int[tmp1.length];
        for (int i = 0; i < tmp1.length; i++) {
            b[i] = Integer.parseInt(tmp1[i]);
        }
        int[] c =new int[a.length+b.length];
        int i=0;
        for (i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        //System.out.println(i);
        for (; i-a.length < b.length; i++) {
            c[i]=b[i-a.length];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
    
}
