package com.study;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.study.domain.BoardDTO;
import com.study.mapper.BoardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MapperTests {

        @Autowired
        private BoardMapper boardMapper;

       /* @Test
        public void testOfInsert(){
            BoardDTO params = new BoardDTO();
            params.setTitle("first board Name");
            params.setContent("first board content");
            params.setWriter("tester");

            int result = boardMapper.insertBoard(params);
            System.out.println("결과는 "+result+"입니다");
        }*/

        @Test
        public void testOfSelectDetail(){
            BoardDTO board = boardMapper.selectBoardDetail((long)1);
            try {
                //String boardJson = new ObjectMapper().writeValueAsString(board);
                String boardJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(board);

                System.out.println("=========================");
                System.out.println(boardJson);
                System.out.println("=========================");

            }catch (JsonProcessingException e){
                e.printStackTrace();
            }
            System.out.println("=======================");
            System.out.println(board);
            System.out.println("=======================");
        }

}
