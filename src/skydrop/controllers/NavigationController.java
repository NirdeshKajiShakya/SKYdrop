/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skydrop.controllers;

/**
 *
 * @author Suresh
 */

import skydrop.controllers.AuthController;
import skydrop.view.*;

public class NavigationController {

    private static NavigationController instance;

    private NavigationController() {}

    public static NavigationController getInstance() {
        if (instance == null) {
            instance = new NavigationController();
        }
        return instance;
    }

    public void navigateToHome() {
        new HomePage().setVisible(true);
    }

    public void navigateToLogin() {
        SignupView signupView = new SignupView();
        LoginView loginView = new LoginView();
        AuthController authController = new AuthController(loginView,signupView);
        loginView.setVisible(true);
        new HomePage().dispose();
    }

    public void navigateToContactUs() {
        new ContactUs().setVisible(true);  // must have  class dont delete
    }

    public void navigateToServices() {
        new ContactUs().setVisible(true);  // dont delete
    }
}

