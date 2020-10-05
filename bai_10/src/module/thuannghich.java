/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

/**
 *
 * @author dangngoccuong
 */
public class thuannghich {

    public void lietKe() {
        for (int i = 100000; i <= 999999; i++) {
            String r = new StringBuffer(String.valueOf(i)).reverse().toString();
            if (i ==  Integer.parseInt(r)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
