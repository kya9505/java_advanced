package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // db 드라이버 조회
            System.out.println("Driver loaded ok!" + connection);

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies?serverTimezone=Asia/Seoul","root","root");
            System.out.println("Connection OK"+connection);
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

class ConnetionEx2{
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver load OK" + connection);

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies?serverTimezone=Asia/Seoul","root","root");
            System.out.println("Conection OK" + connection);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e){
            throw new RuntimeException(e);
        } finally {
            if(connection != null){
                try {
                    connection.close();
                    System.out.println("connetion closed");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}