package java_advanced.src.jdbc.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Userinsert {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // db 드라이버 조회
            System.out.println("Driver loaded ok!" + connection);

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul","root","root");
            System.out.println("Connection OK"+connection);
            String query = "" + "INSERT INTO users(userid,username,userpassword,userage,useremail)"+ "VALUES(?,?,?,?,?);" ;
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"ssgcom3");
            preparedStatement.setString(2,"이민우");
            preparedStatement.setString(3,"password");
            preparedStatement.setInt(4,33);
            preparedStatement.setString(5,"minooo@mail.com");

            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + "row insert");
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
