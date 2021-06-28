/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

/**
 *
 * @author farhan aheer
 */
public class Book extends Admin  {
    private String bookName; 
    private String ISBN;
    private String author;  
     private String publisher; 
    private int pagenum; 
    private int bookcount; 
    
    public Book() {
        super();
    }  
    public Book(String ISBN, String bookName, String author, int pagenum, String publisher, int bookcount) {
        super();
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.author = author;
        this.pagenum = pagenum;
        this.publisher = publisher;
        this.bookcount = bookcount;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPagenum() {
        return pagenum;
    }
    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getBookcount() {
        return bookcount;
    }
    public void setBookcount(int bookcount) {
        this.bookcount = bookcount;
    }

    @Override
    public String toString() {
        return "Book [book title=" + bookName + ",ISBN Number"+ISBN+ ", author="
                + author + ", total pages=" + pagenum + ", publisher=" + publisher
                + ", Number of books=" + bookcount + "]";
    }
   
}
    
