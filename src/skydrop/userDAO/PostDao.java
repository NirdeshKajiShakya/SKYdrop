/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skydrop.userDAO;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
        String query = "SELECT product_name FROM products where product_id = ?";

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
    
    public Image displayImageFromDatabase(int id) {
        try (Connection conn = DbConnection.getConnection()) {
            String query = "SELECT picture FROM products WHERE product_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                byte[] imgBytes = rs.getBytes("picture");

                if (imgBytes != null && imgBytes.length > 0) {
                    ImageIcon icon = new ImageIcon(imgBytes);
                    Image img = icon.getImage().getScaledInstance(161, 149, Image.SCALE_SMOOTH);
                    return img;
                } 

            }
            return null;

        } catch (Exception e) {
            e.printStackTrace();
            
            return null;
        }
    }
    
    public int getProductPriceDB(int product_id) {
        String query = "SELECT price FROM products where product_id = ?";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
               
            pstmt.setInt(1, product_id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()){
                return rs.getInt("price");
            }else{
                return 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public String getProductCategoryDB(int product_id) {
        String query = "SELECT category FROM products where product_id = ?";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
               
            pstmt.setInt(1, product_id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()){
                return rs.getString("category");
            }else{
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
