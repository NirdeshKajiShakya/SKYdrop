/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skydrop;

import skydrop.userDAO.UserDao;

/**
 *
 * @author nirka
 */
public class SKYdrop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.addUser("ram", 15);
        userDao.listUsers();
        
    }
    
}
