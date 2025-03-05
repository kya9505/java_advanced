package java_advanced.src.Quest.dao;

import lombok.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

@Data
public class DBUtil {

    private static ResourceBundle bundle;
    static {
        bundle = ResourceBundle.getBundle("HRmanager0304.config.dbinfo");
        try {
            Class.forName(bundle.getString("driver")); // db 드라이버 조회
        } catch (
                ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
//       Connection conn = null;
        try {
//           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/questdb?serverTimezone=Asia/Seoul" ,"root","root");
//           return conn;
            return DriverManager.getConnection(
                    bundle.getString("url"),
                    bundle.getString("user"),
                    bundle.getString("password"));
        } catch (SQLException e) {
            System.out.println("연결실패");
            return null;
        }
    }
}
