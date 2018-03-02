package com.sgw.oauth.domain.entity.member.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginUserDto {

    private String loginId;
    private String name;

}
