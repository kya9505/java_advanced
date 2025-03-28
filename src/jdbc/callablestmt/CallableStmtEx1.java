package java_advanced.src.jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStmtEx1 {
    Connection conn = null;
    CallableStatement cs = null;

    public CallableStmtEx1() throws SQLException {
        conn =  DButil.getConnection();

        cs = conn.prepareCall("{call P_INSERTCODES(?,?)}");
        cs.setString(1, "프론트 고급 개발자"); // 코드네임
        cs.setString(2, "code1");

        boolean flag = cs.execute();
        System.out.println(flag);

        if(cs != null) cs.close();
        if(conn != null) conn.close();
    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx1();

    }
}