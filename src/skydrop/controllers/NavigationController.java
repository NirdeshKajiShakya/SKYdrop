/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skydrop.controllers;

/**
 *
 * @author Suresh
 */

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
        new LoginView().setVisible(true);  // You must have this class
    }

    public void navigateToContactUs() {
        new ContactUs().setVisible(true);  // You must have this class
    }

    public void navigateToServices() {
        new ServicePage().setVisible(true);  // You must have this class
    }
}

