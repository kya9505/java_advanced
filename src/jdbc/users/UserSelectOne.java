package java_advanced.src.jdbc.users;

import java.sql.*;

public class UserSelectOne {

        public static void main(String[] args) {
            Connection connection = null;
            ResultSet rs = null;
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
                        .append(" select * from users ")
                        .append(" where userid = ? ").toString();

                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1,"ssgcom2");
                rs = preparedStatement.executeQuery();

                if(rs.next()){
                    User user = new User();
                    user.setUserid(rs.getString("userid"));
                    user.setUsername(rs.getString("username"));
                    user.setUserpassword(rs.getString("userpassword"));
                    user.setAge(rs.getInt("userage"));
                    user.setEmail(rs.getString("useremail"));
                    System.out.println(user);
                } else System.out.println("가입된 회원이 아닙니다.");
                preparedStatement.close();
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
