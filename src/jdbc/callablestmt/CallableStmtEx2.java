package java_advanced.src.jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStmtEx2 {
    Connection conn = null;
    CallableStatement cs = null;

    public CallableStmtEx2() throws SQLException {
        conn =  DButil.getConnection();

        cs = conn.prepareCall("{call P_INSERTCODES(?,?,?)}");
        cs.setString(1, "IT 기획자"); // 코드네임
        cs.setString(2, "code1");
        // out 파라매터에 저장된 프로시저의 수행결과에 대한 외부 등록 변수
        cs.registerOutParameter(3, Types.VARCHAR);

        boolean flag = cs.execute();
        System.out.println(flag);

        String resultMsg = cs.getString(3);
        System.out.println(resultMsg);
        if(cs != null) cs.close();
        if(conn != null) conn.close();
    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx2();

    }
}