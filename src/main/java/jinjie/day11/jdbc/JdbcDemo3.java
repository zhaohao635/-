package jinjie.day11.jdbc;

import java.sql.*;

public class JdbcDemo3 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from account";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu?characterEncoding=utf8","root","zhaohao123");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while( rs.next()){
                String string = rs.getString(2);
                double balance = rs.getDouble("balance");
                System.out.println("姓名"+string+"金额"+balance);
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }
}
