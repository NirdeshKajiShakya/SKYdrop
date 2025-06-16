/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skydrop;

import skydrop.controllers.AuthController;
//import skydrop.controllers.NavigationController;
import skydrop.userDAO.UserDao;
import skydrop.view.LoginView;
import skydrop.view.SignupView;
//import skydrop.view.HomePage;
//import skydrop.view.ServicePage;
//import skydrop.view.ContactUs;
/**
 *

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
        
//        HomePage homeView = new HomePage();
//        ContactUs contactView = new ContactUs();
//        ServicePage serviceView = new ServicePage();
  
        AuthController authController = new AuthController(loginView, signupView);
        loginView.setVisible(true);
        
    }
    
}
