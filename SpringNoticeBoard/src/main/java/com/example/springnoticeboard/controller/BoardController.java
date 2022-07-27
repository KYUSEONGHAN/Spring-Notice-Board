package com.example.springnoticeboard.controller;

import com.example.springnoticeboard.domain.BoardVO;
import com.example.springnoticeboard.domain.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.springnoticeboard.persistence.BoardMapper;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class BoardController {
    private final BoardMapper boardMapper;

    @PostMapping("/board")
    public ResultVO addBoard(@RequestBody BoardVO boardVO) {
        int result = boardMapper.insertBoard(boardVO);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }

    @GetMapping("/board/{id}")
    public BoardVO findOne(@PathVariable int id) {
        return boardMapper.findOneBoard(id);
    }

    @GetMapping("/boards")
    public List<BoardVO> findAllBoard() {
        return boardMapper.findBoard();
    }
}
