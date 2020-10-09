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
public class Magazine extends Document{
    //issue number, monthly release
    private int num,month;
    public Magazine(){
        super();
    }
    public Magazine(String code, String pub, int sum,
            int num,int month){
        super(code, pub, sum);
        this.num=num;
        this.month=month;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public String toString(){
        return getCode()+"\t"+
              getPub()+"\t"+getSum()+"\t"+num+"\t"+month;
    }
    public String getHeader(){
        return "Code\tPublisher\tSum\tNum of page\tNumber\tMonth";
    }
}
