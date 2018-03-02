package com.sgw.oauth.domain.entity.member.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class MemberInsertDto {

    @NotNull
    private String loginId;

    @NotNull
    private String password1;

    @NotNull
    private String password2;

    @NotNull
    private String email;

    @NotNull
    private String name;

    @NotNull
    private String phoneNumber;
}
