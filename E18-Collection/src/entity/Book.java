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
public class Book extends Document{
    //author, title and the number of pages
    private String title,author;
    private int page;
    public Book(){
        super();
    }
    public Book(String code, String title,String author,
            String pub, int sum,int page){
        super(code, pub, sum);
        this.title=title;
        this.author=author;
        this.page=page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    public String toString(){
        return getCode()+"\t"+title+"\t"+author+"\t"+
              getPub()+"\t"+getSum()+"\t"+page;
    }
    public String getHeader(){
        return "Code\tTitle\tAuthor\tPublisher\tSum\tNum of page";
    }
}
