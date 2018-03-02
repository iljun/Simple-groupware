package com.sgw.oauth.domain.entity.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
public class ResponseEntity {
    private HttpStatus status;
    private int code;
    private String msg;
    private Object obj;

    public static ResponseEntity of(HttpStatus status, int code, String msg){
        return ResponseEntity.builder()
                .status(status)
                .code(code)
                .msg(msg)
                .build();
    }

    public static ResponseEntity of(String msg){
        return ResponseEntity.builder()
                .msg(msg)
                .build();
    }

    public static ResponseEntity of(HttpStatus status, int code, String msg, Object obj){
        return ResponseEntity.builder()
                .status(status)
                .code(code)
                .msg(msg)
                .obj(obj)
                .build();
    }
}
