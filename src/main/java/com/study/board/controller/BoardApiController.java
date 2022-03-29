package com.study.board.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.study.board.dto.BoardRequestDto;
import com.study.board.dto.BoardResponseDto;
import com.study.board.model.BoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardService boardService;

    /**
     * 게시글 생성
     */
    @PostMapping("/boards")
    public Long save(@RequestBody final BoardRequestDto params) {
        return boardService.save(params);
    }

    /**
     * 게시글 리스트 조회
     */
    @GetMapping("/boards")
    public List<BoardResponseDto> findAll() {
        return boardService.findAll();
    }

    /**
     * 게시글 수정
     */
    @PatchMapping("/boards/{id}")
    public Long save(@PathVariable final Long id, @RequestBody final BoardRequestDto params) {
        return boardService.update(id, params);
    }

    //게시글 삭제
    @DeleteMapping("/boards/{id}")
    public Long delete (@PathVariable final Long id){
        return boardService.delete(id);
    }

    @GetMapping("boards/{id}")
    public BoardResponseDto findById(@PathVariable final Long id){
        return boardService.findById(id);
    }

}
