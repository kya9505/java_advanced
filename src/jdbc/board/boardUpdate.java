package jdbc.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class boardUpdate {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded OK!" + connection);

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "root", "root");
            System.out.println("Connection OK" + connection);

            String query = "" + "update boards set" + " bwriter = ? " + " where bno  = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "타자가 느리다");
            preparedStatement.setInt(2, 2);

            int row = preparedStatement.executeUpdate();
            System.out.println(row + "row update completed");

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