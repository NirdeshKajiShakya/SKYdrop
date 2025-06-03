/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package skydrop.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nirka
 */
public class DbConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/SKYdrop";
    private static final String USER = "newuser";
    private static final String PASSWORD = "Newpassword123&";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
