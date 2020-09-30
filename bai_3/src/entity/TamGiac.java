/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author dangngoccuong
 */
import java.util.Scanner;

public class TamGiac {

    private int a = 0, b = 0, c = 0;

    public void nhap() {
        Scanner in = new Scanner(System.in);
        System.out.print("nhap a: ");
        a = Integer.parseInt(in.nextLine());
        System.out.print("nhap b: ");
        b = Integer.parseInt(in.nextLine());
        System.out.print("nhap c: ");
        c = Integer.parseInt(in.nextLine());
    }

}
