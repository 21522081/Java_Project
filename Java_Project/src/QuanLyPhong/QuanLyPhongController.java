/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyPhong;


import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import QuanLyPhong.QuanLyPhongJFrame;
import KhachHang.KhachHang;
import KhachHang.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class QuanLyPhongController {
    
   // QuanLyPhongJFrame j = new QuanLyPhongJFrame();
    public Connection getConnection() throws SQLException{
        // Thông tin kết nối đến cơ sở dữ liệu
        String url = "jdbc:mysql://localhost:3306/QLKS_1"; // Thay "your_database" bằng tên cơ sở dữ liệu của bạn
        String username = "root";
        String password = "ntduc";

       return DriverManager.getConnection(url, username, password);
   
    

}
  
}
        
        



    

