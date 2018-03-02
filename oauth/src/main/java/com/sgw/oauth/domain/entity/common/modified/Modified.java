package com.sgw.oauth.domain.entity.common.modified;

import com.sgw.oauth.domain.entity.common.create.Created;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners({ ModifiedAuditorAware.class })
public class Modified extends Created {

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;
}
