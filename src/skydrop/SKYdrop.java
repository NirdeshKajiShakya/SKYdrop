/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skydrop;

import skydrop.userDAO.UserDao;
import skydrop.view.LoginView;

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
        userDao.addUser("ram", "ram123@gmail.com","Kathmandu");
        userDao.listUsers();
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        
    }
    
}
