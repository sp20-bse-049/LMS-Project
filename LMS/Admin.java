/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Admin {    
      
    private String username; 
    private String password;
     public Admin( String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }
      public Admin() {
        super();
    }
   
    public String getusername() {
        return username;
    }
    public void setid(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String Password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Admin [ username =" + username + " and password=" + password + "]";
    }
   
}




