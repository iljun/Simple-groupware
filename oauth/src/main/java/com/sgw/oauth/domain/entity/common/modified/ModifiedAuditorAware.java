package com.sgw.oauth.domain.entity.common.modified;

import com.sgw.oauth.domain.entity.common.Constant;
import com.sgw.oauth.domain.entity.common.create.Created;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;

public class ModifiedAuditorAware {
    @PrePersist
    public void setCreated(Created created) {
        created.setCreatedAt(LocalDateTime.now());
        created.setCreatedBy(Constant.SYSTEM);
    }
}
