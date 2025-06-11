/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skydrop;



/**
 *
 * @author nirka
 */
//import skydrop.view.LoginView;
//import skydrop.view.SignupView;
//import controllers.AuthController;
//import javax.swing.SwingUtilities;
//
//
//public class SKYdrop {
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            LoginView loginView = new LoginView();
//            SignupView signupView = new SignupView();
//            AuthController controller = new AuthController(loginView, signupView);
//            
//            // Show the login screen first
//            loginView.setVisible(true);
//        });
//    }
//}

import javax.swing.SwingUtilities;
import controllers.NavigationController;

public class SKYdrop {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NavigationController.getInstance().navigateToHome(); // Launches HomePage via controller
        });
    }
}




