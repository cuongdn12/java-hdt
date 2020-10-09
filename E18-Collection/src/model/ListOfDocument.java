/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Book;
import entity.Document;
import entity.Magazine;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfDocument implements ListFunction{
    private List<Document> list;
    private Scanner in;
    public ListOfDocument(){
        list=new ArrayList<Document>();
        in=new Scanner(System.in);
        list.add(new Book("BB54","hhhh","gghg","hhhh",
                          23, 45));
        list.add(new Book("HH54","hhhh","gghg","hhhh",
                          23, 45));
        list.add(new Book("KK54","hhhh","gghg","hhhh",
                          23, 45));
    }    
    private boolean exitsedCode(String code){
        for(Document i:list)
            if(i.getCode().equalsIgnoreCase(code))
                return true;
        return false;
    } 
    private Document input(){
        String code,pub;
        int sum;
        while(true){
           System.out.print("Enter code:");
           code=in.nextLine().toUpperCase();
           if((code.matches("^[A-Z]{2}\\d{2}"))&&(!exitsedCode(code)))
               break;
           else
                System.out.println("Input again!!!!");
        }
        System.out.print("Enter pub:");
        pub=in.nextLine();
        System.out.print("Enter sum:");
        sum=Integer.parseInt(in.nextLine());
        Document d=new Document(code, pub, sum);
        return d;
    }
    
    @Override
    public void inputBooK() {
        Document d=input();
        String a,t;
        int p;
        System.out.print("Enter Title:");
        t=in.nextLine();
        System.out.print("Enter author:");
        a=in.nextLine();
        System.out.print("Enter page:");
        p=Integer.parseInt(in.nextLine());
        Book b=new Book(d.getCode(), a, t, d.getPub(),
                d.getSum(), p);
        list.add(b);
    }

    @Override
    public void inputMagazine() {
        Document d=input();
        int n,m;
        System.out.print("Enter Number:");
        n=Integer.parseInt(in.nextLine());
        System.out.print("Enter Month:");
        m=Integer.parseInt(in.nextLine());
        
        Magazine m1=new Magazine(d.getCode(), d.getPub(),
                d.getSum(), n,m);
        list.add(m1);
    }

    @Override
    public void print() {
        Book b=new Book();
        System.out.println(b.getHeader());
        for(Document i:list)
            if(i instanceof Book)
               System.out.println(((Book) i).toString());
        Magazine m=new Magazine();
        System.out.println(m.getHeader());
        for(Document i:list)
            if(i instanceof Magazine)
               System.out.println(((Magazine) i).toString());
    }
    
}
