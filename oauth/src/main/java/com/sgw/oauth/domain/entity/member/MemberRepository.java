package com.sgw.oauth.domain.entity.member;

import com.sgw.oauth.domain.entity.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
}
