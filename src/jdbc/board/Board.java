package jdbc.board;

import lombok.Data;

import java.io.File;
import java.sql.Blob;

@Data
public class Board {
    int bno;
    String btitle   ;
    String bcontent ;
    String bwriter;
    String bdate;
    String bfilename;
    Blob filedata;
}
