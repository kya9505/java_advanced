package day8.Board;

import java.util.ArrayList;
import java.util.List;

public class BordMain {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<Board>();
        boardList.add(new Board("제목1","ㄴㄴ1","ㄸ"));
        boardList.add(new Board("제목2","ㄴㄴ2","ㄸ"));
        boardList.add(new Board("제목3","ㄴㄴ3","ㄸ"));

        int size = boardList.size();
        System.out.println("총 글의 수 :"+size);

        Board board = boardList.get(1);
        System.out.printf("주제 : %s 내용: %s 작성자 : %s",board.subject,board.content,board.writer);
        for (Board board1 : boardList){
            System.out.printf("주제 : %s 내용: %s 작성자 : %s\n",board.subject,board.content,board.writer);}

    }

}
