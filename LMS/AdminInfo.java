/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

import java.util.ArrayList;
import java.util.List;
public class AdminInfo implements AdminOperation{
    List<Admin> adminlist=new ArrayList<Admin>();   
     public void init(){
        Admin admin = new Admin("admin","123456");
        adminlist.add(admin);
     }     
    @Override
    public List<Admin> AdminList() {        
        return adminlist;
    }
    @Override
    public boolean insert(Admin admin) {
        return adminlist.add(admin);        

    }      
}
