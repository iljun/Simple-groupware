package com.sgw.oauth.domain.entity.role;

import com.sgw.oauth.domain.entity.common.create.Created;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "role")
@Table(name = "role")
@Where(clause = "deleted = 0")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role extends Created implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_idx")
    private Long idx;

    @Column(name = "name")
    private String name;
}
