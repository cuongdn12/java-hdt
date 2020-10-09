/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Document {
    //code, publisher and 
    //circulation (tổng số phát hành)
    private String code,pub;
    private int sum;

    public Document() {
    }

    public Document(String code, String pub, int sum) {
        this.code = code;
        this.pub = pub;
        this.sum = sum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
}
