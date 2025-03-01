package java_advanced.src.Quest.dao;

import lombok.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * packageName   : jdbc.advanced.users
 * fileName      : DBUtil
 * author        : a
 * date          : 2025-02-28
 * description   : 데이터베이스 연결 작업 클래스
 * =================================================
 * DATE             AUTHOR             NOTE
 * -------------------------------------------------
 * 2025-02-28        a
 */

@Data
public class DBUtil {

    private static ResourceBundle bundle;

    static { // 클래스명으로 호출하려고?
        bundle = ResourceBundle.getBundle("Quest.cofing.dbinfo");
        try {
//           Class.forName("com.mysql.cj.jdbc.Driver"); // db 드라이버 조회
            Class.forName(bundle.getString("driver")); // db 드라이버 조회
        } catch (
                ClassNotFoundException e) {
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
