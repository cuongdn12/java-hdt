/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class Vocung {
    public void sin_x(){
        double x;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap x: ");
        x = Double.parseDouble(in.nextLine());
        int i =3, j=1, t=1;
        double s=x, sum = x;
        while(s>0.001){
            t = i*(i-1)*t;
            s=Math.pow(-x, j)/t;
            sum+=s;
            i+=2;
            j++;
        }
        System.out.println(sum);
    }
    public void cos_x(){
        double x;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap x: ");
        x = Double.parseDouble(in.nextLine());
        int i =2, j=1, t=1;
        double s=x, sum = 1;
        while(s>0.001){
            t = i*(i-1)*t;
            s=Math.pow(-x, j)/t;
            sum+=s;
            i+=2;
            j++;
        }
        System.out.println(sum);
    }
}
