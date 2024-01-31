/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Macbook Pro
 */
public class userDAO extends DBUtils{
        Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    
    public boolean Register(UserDTO us){
        boolean f = false;
    String sql ="insert into Users(name,username,email,password,role_id) values(?,?,?,?,1)";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, us.getName());
            ps.setString(2, us.getUsername());
            ps.setString(3, us.getEmail());
            ps.setString(4, us.getPassword());
            
           int i = ps.executeUpdate();
           
            if (i == 1) {
                f = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return f;
    }
    public UserDTO Login(String username, String password){
        UserDTO us = new UserDTO() ;
        String sql = "select * from Users where username = ? and password = ?";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                us.setId(rs.getInt(1));
                us.setName(rs.getString(2));
                us.setUsername(rs.getString(3));
                us.setEmail(rs.getString(4));
                us.setPassword(rs.getString(5));
                us.setRole_id(rs.getInt(6));
            return us;
            }else{
                    return null;
                    }
            
            
        } catch (Exception e) {
             e.printStackTrace();
         }
        
        
        return us ;
    }
      public List<Book> getAllBook() {
        List<Book> list = new ArrayList<>();
        String query = "select * from Book";
        try {
            conn = new DBUtils().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Book(rs.getInt(1),
                        rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }
      public static void main(String[] args) {
        // Tạo một đối tượng để thao tác với cơ sở dữ liệu
        // và gọi hàm getAllBook() để lấy danh sách các cuốn sách
        userDAO bookDAO = new userDAO();
        List<Book> books = bookDAO.getAllBook();

        // In ra thông tin của từng cuốn sách trong danh sách
        for (Book book : books) {
            System.out.println("Book ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            // In các thông tin khác của cuốn sách tương tự
            System.out.println("--------------------");
        }
    }
    

}