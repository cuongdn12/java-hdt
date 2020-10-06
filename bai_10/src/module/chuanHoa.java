/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author dangngoccuong
 */
public class chuanHoa {

    private String ho_ten, p;

    public void nhap_hoten() {
        Scanner in = new Scanner(System.in);
        ho_ten = in.nextLine();
        ho_ten.trim().replaceAll("\\s+", " ");
        String ten = ho_ten.substring(ho_ten.lastIndexOf(" ") + 1);
        ten = Character.toUpperCase(ten.charAt(0)) + ten.substring(1);
        String ho = ho_ten.substring(0, ho_ten.indexOf(" "));
        ho = Character.toUpperCase(ho.charAt(0)) + ho.substring(1);
        System.out.println("Họ là: " + ho);
        System.out.println("Tên là: " + ten);;
    }

//    dang ngoc  , dakfja,   djasd  .
    public void doan_van() {
        Scanner in = new Scanner(System.in);
        p = in.nextLine();
        p = p.replaceAll("\\s+", " ");
        p = p.replaceAll("\\s?\\.\\s?", ". ");
        p = p.replaceAll("\\s?\\,\\s?", ", ");
        p = p.replaceAll("\\s?\\?\\s?", "? ");
        p = p.replaceAll("\\s?\\!\\s?", "! ");
        p =p.trim();
        String[] arr=p.split("(?<=[.?!][\\s?])");
        String param="";
        int so_cau = arr.length, so_tu=0;
        for (String string : arr) {
            param+=Character.toUpperCase(string.charAt(0))+string.substring(1);
            so_tu+=string.split(" ").length;
        }
        System.out.println(param);
        System.out.println("So cau: "+so_cau+" so tu: "+so_tu);
    }
}
