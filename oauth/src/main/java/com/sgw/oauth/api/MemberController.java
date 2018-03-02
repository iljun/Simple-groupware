package com.sgw.oauth.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/member")
public class MemberController {

    @PostMapping("")
    public ResponseEntity<ResponseEntity> join(@ResponseBody MemberInsertDto memberInsertDto){

    }
}
