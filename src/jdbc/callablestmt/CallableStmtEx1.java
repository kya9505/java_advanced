package java_advanced.src.jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStmtEx1{
    Connection conn = null;
    CallableStatement cs = null;

    public CallableStmtEx1() throws SQLException {
    DButil.getConnection();
    cs = conn.prepareCall("{call p_insertcodes(?,?)}")
    }
}
