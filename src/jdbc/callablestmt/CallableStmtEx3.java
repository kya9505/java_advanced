package java_advanced.src.jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStmtEx3 {
    Connection conn = null;
    CallableStatement cs = null;

    public CallableStmtEx3() throws SQLException {
        conn =  DButil.getConnection();
        conn.setAutoCommit(false);

        cs = conn.prepareCall("{call SP_MEMBER_INSERT(?,?,?,?,?)}");
        cs.setString(1, "younah"); // 코드네임
        cs.setString(2, "1234");
        cs.setString(3, "dbsdk4211");
        cs.setString(4, "12345677");
        // out 파라매터에 저장된 프로시저의 수행결과에 대한 외부 등록 변수
        cs.registerOutParameter(5, Types.INTEGER);

        boolean flag = cs.execute();
        System.out.println(flag);

        String resultMsg = cs.getString(5);
        System.out.println(resultMsg);

        conn.commit();

        if(cs != null) cs.close();
        if(conn != null) conn.close();
    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx3();

    }
}