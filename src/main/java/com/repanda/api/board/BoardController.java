package com.repanda.api.board;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @GetMapping(value = "/board")
    @ResponseBody
    public String initBoard() {
        System.out.println("게시판 페이지 오픈 !!");
        return "Board";
    }
}
