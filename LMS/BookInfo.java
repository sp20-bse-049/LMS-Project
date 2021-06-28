/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;
import java.util.ArrayList;
import java.util.List;

public class BookInfo implements BookOperation {
    List<Book> booklist=new ArrayList<Book>(); 
       public boolean init(){
           Book book1=new Book("1001","Alchemist","AbuHanifi",120,"Best Publishing House",20);
           Book book2=new Book("1002","physics","Newton",200,"Best Publishing House",15);
           Book book3=new Book("1003","Chemistry","JJ Thomson",300,"Best Publishing House",30);
           Book book4=new Book("1004","English","Mr.Chips",100,"Best Publishing House",10);
           Book book5=new Book("1005","Urdu","Ghalib",400,"Best Publishing House",23);
           Book book6=new Book("1006","Three Kingdoms","Haider",100,"Best Publishing House",60);
           booklist.add(book1);
           booklist.add(book2);
           booklist.add(book3);
           booklist.add(book4);
           booklist.add(book5);
           booklist.add(book6);
        return true;
       }    
    @Override
    public List<Book> getAllList() {
        return booklist;
    }
    @Override
    public boolean Addbook(Book book) {
        return booklist.add(book);      
    }
    @Override
    public boolean Updatebook(Book book) {
        return false;
    }   
    @Override
    public boolean Deletebook(Book book) {
        return false;   
    }

    

   
}
    

