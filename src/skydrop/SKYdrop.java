/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skydrop;

import skydrop.controllers.AuthController;
import skydrop.userDAO.UserDao;
import skydrop.view.LoginView;
import skydrop.view.SignupView;

/**
 *
 * @author nirka
 */
public class SKYdrop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // insert into database
//        UserDao userDao = new UserDao();
//        userDao.addUser("ram", "ram123@gmail.com","Kathmandu");
//        userDao.listUsers();
        // login view and signup view
        LoginView loginView = new LoginView();
        SignupView signupView = new SignupView();
        AuthController authController = new AuthController(loginView, signupView);
        loginView.setVisible(true);
        
    }
    
}
