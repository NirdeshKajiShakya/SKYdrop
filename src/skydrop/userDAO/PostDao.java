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
public class PostDao {
    public void addPost(String name, float price, String detail, String variety, String picture, String admin_id, String category_id){
        String query = "INSERT INTO products (product_name, price, detail, varity, picture, admin_id, category_id) VALUES (?,?,?,?,?,?,?)";
        try (Connection conn = DbConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setFloat(2, price);
            pstmt.setString(3, detail);
            pstmt.setString(4, variety);
            pstmt.setString(5, picture);
            pstmt.setString(6, admin_id);
            pstmt.setString(7, category_id);
            pstmt.executeUpdate();
            System.out.println("User added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void listPosts() {
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
