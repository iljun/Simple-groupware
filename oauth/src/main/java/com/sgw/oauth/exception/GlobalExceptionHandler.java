package com.sgw.oauth.exception;

import com.sgw.oauth.domain.entity.common.ResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public org.springframework.http.ResponseEntity defaultHandler(Exception e) throws Exception{
        log.error(e.getMessage());

        return new org.springframework.http.ResponseEntity(ResponseEntity.of(e.getMessage()),null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
