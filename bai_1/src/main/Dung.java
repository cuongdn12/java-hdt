/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dangngoccuong
 */
public class Dung {

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String tmp[] = str.split(" ");
        System.out.println(Arrays.toString(tmp));
    }
}
