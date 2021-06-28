/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;
import java.util.Scanner;
public class BookMenu {
     Scanner input=new Scanner(System.in);
    BookDetails bDetail =new BookDetails();
    Admin admtemp=null;

   public BookMenu(){
       bDetail.bInfo.init();
       bDetail.adInfo.init();
   }
   
    public void showmenu(){
        while(true){
        System.out.println("Assalam-o-Alaikum! Welcome to Public Library");
        System.out.println("----------------------------------------------");
        System.out.println("Before Login, first Register yourself.......");
        System.out.println("1. login");
        System.out.println("2. Registration");
        System.out.println("3. Exit");
        int search=input.nextInt();
        
        switch (search) {
        case 1:

            System.out.println("please enter user name:");
            String adid=input.next();
            System.out.println("Please enter the password:");
            String adpwd=input.next();
            boolean isloginsuceess=bDetail.Register(adid, adpwd);
            if (isloginsuceess==true) {
               showLoginMenu();
            } 
            else{
                System.out.println("username or Password is incorrect");
            }
            continue;
            
        case 2:
            
            System.out.println("please enter user name:");
            String username1=input.next();
            System.out.println("Please enter the password:");
            String password1=input.next();
            bDetail.Regist(username1, password1);
            System.out.println("registered");
            continue;
        case 3://drop out
            System.out.println("_________ Thanks for Using__________");
            System.exit(1);
            continue;
        default:
            showmenu();
            break;
        }
        }
    }
  
    public void showLoginMenu(){
        while(true){
            System.out.println("Welcome to the library management system");
            System.out.println("-----------------------------------------");
            System.out.println("1. Show all books");
            System.out.println("2. Search a book by author");
            System.out.println("3. Search a Book by Title");
            System.out.println("4. Add New Book");
            System.out.println("5. Modify the number of books");
            System.out.println("6. Delete a Book");
            System.out.println("7. Return to previous menu");
            System.out.println("-----------------------------");
            System.out.println("Please select between(1-7):");
            int select=input.nextInt();
            
            switch (select) {
            case 1:
                ShowAllBook();
                break;
            case 2:
                selectAuthor();
                break;
            case 3:
                selectBookName();
                break;
            case 4:
                insertBook();
                break;
            case 5:
                UpdateBookCount();
                break;
            case 6:
                delete();
                break;
            case 7:
                System.out.println("Thank you for using and see you next time!");
                showmenu();
                break;
            default:
                showLoginMenu();
                break;
            }
        }

    }
     public void ShowAllBook(){
             bDetail.showALLBook();
     }

     public void selectAuthor(){
            System.out.println("Please enter the author's name:");
            String author=input.next();
            bDetail.SearchByAuthor(author);
     }
     public void selectBookName(){
            System.out.println("Please enter the title of the search:");
            String bookname=input.next();
            bDetail.SearchByBookName(bookname);
     }
     public void insertBook(){
        System.out.println("Add Book:");
        System.out.println("Please enter the new book ISBN number");
        String isbn=input.next();
        System.out.println("Please enter the name of the new book");
        String name=input.next();
        System.out.println("Please enter the author of the new book");
        String author1=input.next();
        System.out.println("Please enter the number of new book pages");
        int pag=input.nextInt();
        System.out.println("Please enter the new book publisher");
        String pub=input.next();
        System.out.println("Please enter the number of new books");
        int count=input.nextInt();
         bDetail.Addbook(isbn, name, author1, pag, pub, count);
     }
     public void UpdateBookCount(){
        System.out.println("Please enter the book ISBN number to be modified:");
        String ISBN=input.next();
        System.out.println("Please enter the number of books to modify:");
        int bookcount=input.nextInt();
        bDetail.Updatecount(ISBN, bookcount);
     }
     public void delete(){
        System.out.println("Ready to delete book");
        System.out.println("Please enter the book ISBN Number to delete:");
        String is=input.next();
        bDetail.Deletebook(is);
     }

    
}
    

