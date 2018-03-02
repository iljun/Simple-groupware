package com.sgw.oauth.domain.entity.common.create;

import com.sgw.oauth.domain.entity.common.Constant;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;

public class CreatedAuditorAware {
    @PrePersist
    public void setCreated(Created created) {
        created.setCreatedAt(LocalDateTime.now());
        created.setCreatedBy(Constant.SYSTEM);
    }
}
