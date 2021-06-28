/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;
import java.util.List;
public interface AdminOperation {
     public List<Admin> AdminList();
    public boolean insert(Admin admin);
}
