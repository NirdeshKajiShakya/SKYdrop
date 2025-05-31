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
    public void addUser(String something_name, int age){
        String query = "INSERT INTO something (something_name, age) VALUES (?, ?)";
        try (Connection conn = DbConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, something_name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            System.out.println("User added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void listUsers() {
        String query = "SELECT * FROM something";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("something_name") +
                                   ", Age: " + rs.getInt("age"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
