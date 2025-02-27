package jdbc.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDelete {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // db 드라이버 조회
            System.out.println("Driver loaded ok!" + connection);

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul","root","root");
            System.out.println("Connection OK"+connection);
//            String query = "" + "update users set userpassword = ? where userid = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1,"12345");
//            preparedStatement.setString(2,"ssgcom1");

            String query = new StringBuilder()
                    .append(" delete from users ")
                    .append(" where userid = ? ").toString();


            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"ssgcom1");

            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + "row delete completed");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch (SQLException e ){
            throw new RuntimeException(e);
        }finally {
            if (connection != null){
                try{
                    connection.close();
                    System.out.println("connection closed");
                }catch (SQLException e ){
                    e.printStackTrace();
                }
            }
        }
    }
}
