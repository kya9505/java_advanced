package java_advanced.src.jdbc.board;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class boardInsert {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // db 드라이버 조회
            System.out.println("Driver loaded ok!" + connection);

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "root", "root");
            System.out.println("Connection OK" + connection);

            String query = "" + "INSERT INTO boards(btitle,bcontent,bwriter,bdate,bfilename,bfiledata)" + "VALUES(?,?,?,now(),?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
           preparedStatement.setString(1,"봄이로구나");
           preparedStatement.setString(2,"제곧내");
           preparedStatement.setString(3,"호이");
           preparedStatement.setString(4,"spring.jpg");
           preparedStatement.setBlob(5,new FileInputStream("C:/Users/study/java/java_advanced/src/jdbc/board/image/spring.jpg"));

            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + "row insert");
            if(rows == 1) {
                ResultSet rs = preparedStatement.getGeneratedKeys();
                if(rs.next()){
                    int bno = rs.getInt(1);
                    System.out.println(bno);
                }
                rs.close();

            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("connection closed");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


