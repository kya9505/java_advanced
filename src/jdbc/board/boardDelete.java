package java_advanced.src.jdbc.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class boardDelete {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded OK!" + connection);

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "root", "root");
            System.out.println("Connection OK" + connection);

            String query = "" + "DELETE FROM boards" + " where bno = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query); // 쿼리문 실행한 결과를 변수에 저장
            preparedStatement.setString(1, "1"); // 첫번째 ? set

            int row = preparedStatement.executeUpdate(); // 쿼리 실행 후 수정된 row갯수 가져오기

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection closed");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
