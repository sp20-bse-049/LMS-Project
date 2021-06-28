/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

import java.util.List;

public class BookDetails {
    public BookInfo bInfo = new BookInfo();
    public AdminInfo adInfo = new AdminInfo();
    List<Admin> admList = adInfo.AdminList();
    List<Book> booklist = bInfo.getAllList();
    Book book=new Book();

    public Admin getAdminName(String name) {
        for (int i = 0; i < admList.size(); i++) {
            Admin adm = admList.get(i);
            if (adm.getusername().equals(name)) {
                return adm;
            }
        }
        return null;
    }
    public void showALLBook() {
        int sum=0;
        System.out.println("This library is shared"+booklist.size()+" Book");
        for (int i = 0; i < booklist.size(); i++) {
            Book booktemp = booklist.get(i);
            System.out.println(booktemp.toString());
            sum +=booklist.get(i).getBookcount();   
        }
        System.out.println("Library Total Collection:"+sum+"this");  
    }
    public boolean Register(String adid, String adpwd) {
        for (int i = 0; i < admList.size(); i++) {
            Admin adtemp = admList.get(i);
            if (adid.equals(adtemp.getusername())
                    && adpwd.equals(adtemp.getPassword())) {
                System.out.println("you are successfuly entered the system!");
                return true;
            }
        }
        return false;
    }
    public boolean SearchByAuthor(String author) {
         for (int i = 0; i <booklist.size(); i++) {
            Book booktemp=booklist.get(i);
            if(booktemp.getAuthor().equals(author)){
                System.out.println(booktemp.toString());

            }
         }       
        return false;
    }
    public boolean SearchByBookName(String bookname){

         for (int i = 0; i <booklist.size(); i++) {
            Book booktemp=booklist.get(i);
            if(booktemp.getBookName().equals(bookname)){
                System.out.println(booktemp.toString());
            }
         }       
        return false;
    }
   
    public boolean Addbook(String ISBN, String bookName, String author,
            int pagenum, String publisher, int bookcount) {
        Book book=new Book(ISBN, bookName, author, pagenum, publisher, bookcount);
        for (int i = 0; i < booklist.size(); i++) {
              Book booktemp=booklist.get(i);
              if (booktemp.getISBN().equals(ISBN) || booktemp.getBookName().equals(bookName)){
                  System.err.println("The book you entered already exists"); 
                  return false;
            }
        }
        bInfo.Addbook(book);
        System.out.println("added successfully!");
        return true;

    }
   
    public boolean Updatecount(String ISBN, int bookcount) {
        for (int i = 0; i <booklist.size(); i++) {
             Book booktemp=booklist.get(i);
             if(booktemp.getISBN().equals(ISBN)){
                 booktemp.setBookcount(bookcount);
                 System.out.println("Successfully modified");
             }       
        }   
        return false;
    }
  
    public boolean Deletebook(String Isbn) {
        for (int i = 0; i <booklist.size(); i++) {
             Book booktemp=booklist.get(i);
             if(booktemp.getISBN().equals(Isbn)){
                booklist.remove(i);
                System.out.println("successfully deleted"); 
             }
             else{
                 System.out.println("The book ISBN Number you want to delete was not found!");
                 return true;
             }
        }
        return false;
    }
    public void Regist(String name, String password) {
        Admin admin = new Admin( name, password);
        adInfo.insert(admin);
    }

    
}
