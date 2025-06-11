/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skydrop.controllers;

/**
 *
 * @author Suresh
 */
import skydrop.view.LoginView;
import skydrop.view.SignupView;
import skydrop.model.User;
import javax.swing.*;
import java.awt.event.*;
import java.util.prefs.Preferences;
import skydrop.userDAO.UserDao;

public class AuthController {
    private LoginView loginView;
    private SignupView signupView;
    private Preferences prefs;
    
    public AuthController(LoginView loginView, SignupView signupView) {
        this.loginView = loginView;
        this.signupView = signupView;
        this.prefs = Preferences.userRoot().node(this.getClass().getName());
        
        initLoginListeners();
        initSignupListeners();
        loadRememberedEmail();
    }
    
    public boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }
    
    private void initLoginListeners() {
        loginView.getLoginButton().addActionListener(e -> handleLogin());
        
        loginView.getSignupLink().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loginView.setVisible(false);
                signupView.setVisible(true);
            }
        });
    }
    
    private void initSignupListeners() {
        signupView.getCreateAccountButton().addActionListener(e -> handleSignup());
        
        signupView.getLoginLink().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                signupView.setVisible(false);
                loginView.setVisible(true);
            }
        });
    }
    
    private void loadRememberedEmail() {
        String rememberedEmail = prefs.get("email", null);
        if (rememberedEmail != null) {
            loginView.setEmail(rememberedEmail);
            loginView.setRememberMe(true);
        }
    }
    
    private void handleLogin() {
        String email = loginView.getEmail();
        String password = loginView.getPassword();
        
        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(loginView, 
                "Please enter both email and password", 
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (loginView.isRememberMeSelected()) {
            prefs.put("email", email);
        } else {
            prefs.remove("email");
        }
        
        JOptionPane.showMessageDialog(loginView, "Login successful!");
    }
    
    private void handleSignup() {
        String email = signupView.getEmail();
        String password = signupView.getPassword();
        String contact = signupView.getPhone();
        String name = signupView.getName();
        String address = signupView.getAddress();
        String gender = signupView.getGender();
        String DOB = signupView.getDOB();
        
        
        String confirmPassword = signupView.getConfirmPassword();
        
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(signupView, 
                "Passwords don't match",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!isValidEmail(email)){
            JOptionPane.showMessageDialog(loginView, 
            "Please enter a valid email address", 
            "Invalid Email", JOptionPane.ERROR_MESSAGE);
            return;
        }
        UserDao userDao = new UserDao();
        userDao.addUser(name,contact,email,password,address,gender,DOB);
        
        
        User newUser = new User(email, password);
        JOptionPane.showMessageDialog(signupView, 
            "Account created successfully!");
    }
}