package com.sgw.oauth.domain.entity.member;

import com.sgw.oauth.domain.entity.common.modified.Modified;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "member")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "member")
@Where(clause = "deleted = 0")
public class Member extends Modified implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_idx")
    private Long idx;

    @Column(name = "login_id")
    private String loginId;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "deleted")
    private boolean deleted;

//    @Column(name = "grant")
//    @OneToMany(mappedBy = "grant_idx", targetEntity = Grant.class)
//    private List<Grant> grants;
}
