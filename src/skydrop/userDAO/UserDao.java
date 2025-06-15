/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skydrop.userDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import skydrop.database.DbConnection;

/**
 *
 * @author nirka
 */
public class UserDao {
    public void addUser(String name, String email, String address){
        String query = "INSERT INTO users (user_name, email, address) VALUES (?, ?, ?)";
        try (Connection conn = DbConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3,address);
            pstmt.executeUpdate();
            System.out.println("User added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void listUsers() {
        String query = "SELECT * FROM users";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +   
                                   ", Name: " + rs.getString("user_name") +
                                   ", Email: " + rs.getString("email") +
                                   ", Address: " + rs.getString("address") 
                                   );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
