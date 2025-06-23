/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skydrop.userDAO;


import org.mindrot.jbcrypt.BCrypt;
import java.sql.*;
import skydrop.database.DbConnection;

/**
 *
 * @author nirka
 */
public class UserDao {
    public String hashedPassword(String password){
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }
    
    public static boolean checkPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }
    
    public void addUser(String name, String contact, String email, String password, String address, String gender, String DOB){
        String query = "INSERT INTO users (user_name, email, address, contact, current_password, gender, D_O_B) VALUES (?,?,?,?,?,?,?)";
        try (Connection conn = DbConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, address);
            pstmt.setString(4, contact);
            pstmt.setString(5, hashedPassword(password));
            pstmt.setString(6, gender);
            pstmt.setString(7, DOB);
            pstmt.executeUpdate();
            System.out.println("User added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public String getPasswordDB(String email) {
        String query = "SELECT current_password FROM users where email = ?";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
               
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()){
                return rs.getString("current_password");
            }else{
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String getUserNameDB(int user_id){
        String query = "SELECT user_name FROM users where user_id = ?";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
               
            pstmt.setInt(1, user_id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()){
                return rs.getString("user_name");
            }else{
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int getUser_idDB(String email) {
        String query = "SELECT user_id FROM users where email = ?";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
               
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()){
                System.out.print(rs.getInt("user_id"));
                return rs.getInt("user_id");
                
            }else{
                return 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public String getEmailDB(int user_id){
        String query = "SELECT email FROM users where user_id = ?";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
               
            pstmt.setInt(1, user_id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()){
                return rs.getString("email");
            }else{
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String getAddressDB(int user_id){
        String query = "SELECT address FROM users where user_id = ?";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
               
            pstmt.setInt(1, user_id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()){
                return rs.getString("address");
            }else{
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    

}
