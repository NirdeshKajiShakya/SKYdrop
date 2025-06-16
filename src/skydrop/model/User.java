/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skydrop.model;

/**
 *
 * @author Suresh
 */
public class User {
    private int user_id;
    private String email;
    private String password;
    
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public int getUser_id() { return user_id; }
    
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setUser_id(int user_id) { this.user_id = user_id; }    
}
