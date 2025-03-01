package java_advanced.src.jdbc.board;

import lombok.Data;

import java.io.File;
import java.sql.Blob;

@Data
public class Board {
    private int bno;
    private String btitle ;
    private String bcontent ;
    private String bwriter;
    private String bdate;
    private String bfilename;
    private Blob filedata;
}
