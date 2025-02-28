package jdbc.boardClass;

import lombok.Data;

import java.sql.Blob;
@Data
public class boardDTO {
    private int bno;
    private String btitle ;
    private String bcontent ;
    private String bwriter;
    private String bdate;
    private String bfilename;
    private Blob filedata;
}
