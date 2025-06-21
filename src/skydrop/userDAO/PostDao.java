/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skydrop.userDAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
    public void addPost(String name, int price, String detail, File picture, int admin_id, String category) throws FileNotFoundException{
        String query = "INSERT INTO products (product_name, price, detail, picture, admin_id, category) VALUES (?,?,?,?,?,?)";
        try (Connection conn = DbConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, price);
            pstmt.setString(3, detail);
            FileInputStream fis = new FileInputStream(picture);
            pstmt.setBinaryStream(4, fis, (int) picture.length());
            pstmt.setInt(5, admin_id);
            pstmt.setString(6, category);
            pstmt.executeUpdate();
            System.out.println("Product added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public String getProductNameDB(int product_id) {
        String query = "SELECT product_name FROM users where product_id = ?";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
               
            pstmt.setInt(1, product_id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()){
                return rs.getString("product_name");
            }else{
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
