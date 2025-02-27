package jdbc.board;

import lombok.Data;

import java.sql.*;

public class boardSelectOne {
    public static void main(String[] args) {
        Connection connection = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Load" + connection);

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul","root","root");
            System.out.println("Connection success");

            String query = ""+"select * from boards" + " where bno = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,4);

            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                Board board = new Board();
                board.setBno(resultSet.getInt("bno"));
                board.setBtitle(resultSet.getString("btitle"));
                board.setBcontent(resultSet.getString("bcontent"));
                board.setBwriter(resultSet.getString("bwriter"));
                board.setBdate(resultSet.getString("bdate"));
                board.setBfilename(resultSet.getString("bfilename"));
                board.setFiledata(resultSet.getBlob("bfiledata"));
                System.out.println(board);
            }else System.out.println("가입된 회원이 아닙니다.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(connection != null) {
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
