package com.example.springnoticeboard.persistence;

import com.example.springnoticeboard.domain.BoardVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

// control 레이어에서 request를 받은 다음에 바로 응답을 주는것이 아니라
// db를 조회해야 하므로 db 처리를 담당할 persistence 레이어 생성

@Mapper
public interface BoardMapper {
    @Select({"<script>",
            "SELECT * from board",
            "order by id desc",
            "</script>"})
    List<boardvo> findBoard();

    @Select({"<script>",
            "SELECT * from board",
            "where id = #{id}",
            "</script>"})
    BoardVO findOneBoard(int id);
    @Insert({"<script>",
            "INSERT INTO board(title, content)",
            "VALUES(#{title}, #{content})",
            "</script>"})
    int insertBoard(BoardVO boardVO);  // 입력이 성공하면 1이 return, 실패하면 0이 return
}
