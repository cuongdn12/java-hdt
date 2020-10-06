/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.StringTokenizer;

/**
 *
 * @author dangngoccuong
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String hoten = "Trinh Thi Van     Anh";
        StringTokenizer a = new StringTokenizer(hoten);
        while (a.hasMoreTokens()) {
            System.out.println(a.nextToken());
        }
//        String[] t = hoten.split("\\s+");
//        String email = t[t.length - 1];
//        for (int i = 0; i <= t.length - 2; i++) {
//            email += Character.toLowerCase(t[i].charAt(0));
//        }
//        email += "@ptit.edu.vn";
//        System.out.println(email);

    }

}
