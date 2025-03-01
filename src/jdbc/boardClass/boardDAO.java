package java_advanced.src.jdbc.boardClass;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class boardDAO {
    Connection connection;
    ResultSet resultSet;

    public void run() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                driver();
                System.out.println("1.insert | 2.delete | 3.update | 4.selectOne | 5.selectAll | 6.exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        insert();
                        break;
                    case 2:
                        delete();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        selectOne();
                        break;
                    case 5:
                        selectAll();
                        break;
                    case 6:
                        close();
                        System.exit(0);
                    default:
                        System.out.println("다시 선택해주세요");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }


    public void driver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // db 드라이버 조회
            System.out.println("Driver loaded ok!" + connection);

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "root", "root");
            System.out.println("Connection OK" + connection);
            if (connection != null) {
                System.out.println("Connection OK: " + connection);
            } else {
                System.out.println("Connection failed!");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Connection closed");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public int insert() {
        try {
            String query = "" + "INSERT INTO boards(btitle,bcontent,bwriter,bdate,bfilename,bfiledata)" + "VALUES(?,?,?,now(),?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, "봄이로구나");
            preparedStatement.setString(2, "제곧내");
            preparedStatement.setString(3, "호이");
            preparedStatement.setString(4, "spring.jpg");
            preparedStatement.setBlob(5, new FileInputStream("C:/Users/study/java/java_advanced/src/jdbc/board/image/spring.jpg"));

            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + "row insert");
            if (rows == 1) {
                ResultSet rs = preparedStatement.getGeneratedKeys();
                if (rs.next()) {
                    int bno = rs.getInt(1);
                    System.out.println(bno);
                }
                rs.close();
            }
            return rows;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public int delete() {

        int row = 0; // 쿼리 실행 후 수정된 row갯수 가져오기
        try {
            String query = "" + "DELETE FROM boards" + " where bno = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query); // 쿼리문 실행한 결과를 변수에 저장
            preparedStatement.setString(1, "5"); // 첫번째 ? set

            row = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return row;
    }

    public int update() {
        int row = 0;
        try {
            String query = "" + "update boards set" + " bwriter = ? " + " where bno  = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "타자가 느리다");
            preparedStatement.setInt(2, 3);

            row = preparedStatement.executeUpdate();
            System.out.println(row + "row update completed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }

        return row;
    }

    public boardDTO selectOne() {
        boardDTO board = null;
        try {
            String query = "" + "select * from boards" + " where bno = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 4);
            board = new boardDTO();

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                board.setBno(resultSet.getInt("bno"));
                board.setBtitle(resultSet.getString("btitle"));
                board.setBcontent(resultSet.getString("bcontent"));
                board.setBwriter(resultSet.getString("bwriter"));
                board.setBdate(resultSet.getString("bdate"));
                board.setBfilename(resultSet.getString("bfilename"));
                board.setFiledata(resultSet.getBlob("bfiledata"));
                System.out.println(board);
            } else System.out.println("가입된 회원이 아닙니다.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return board;
    }

    public boardDTO selectAll() {
        boardDTO board = null;
        try {
            String query = "" + "select * from boards";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            board = new boardDTO();
            while (resultSet.next()) {
                board.setBno(resultSet.getInt("bno"));
                board.setBtitle(resultSet.getString("btitle"));
                board.setBcontent(resultSet.getString("bcontent"));
                board.setBwriter(resultSet.getString("bwriter"));
                board.setBdate(resultSet.getString("bdate"));
                board.setBfilename(resultSet.getString("bfilename"));
                board.setFiledata(resultSet.getBlob("bfiledata"));
                System.out.println(board);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return board;
    }
}

