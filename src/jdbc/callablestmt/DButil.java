package java_advanced.src.jdbc.callablestmt;


import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//singletone
public class DButil {
    private static Connection conn = null;
    private DButil(){}

    public static Connection getConnection() {
        if (conn != null) return conn;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ip로 연동
            String url = "jdbc:mysql://localhost:3306/ssgdb?useSSL=false&serverTime+UTC";
            String username = "ssg";
            String password = "ssg";
            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버를 찾을 수 없습니다. 로드 실패!" + e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }



}
