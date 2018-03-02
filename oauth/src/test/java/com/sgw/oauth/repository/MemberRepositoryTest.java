package com.sgw.oauth.repository;

import com.sgw.oauth.domain.entity.member.Member;
import com.sgw.oauth.domain.entity.member.MemberRepository;
import lombok.extern.java.Log;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    Member defaultMember = new Member();

    @Before
    public void setUp(){
        defaultMember.setLoginId("admin");
        defaultMember.setPassword("admin");
        defaultMember.setEmail("admin@admin.com");
        defaultMember.setPhoneNumber("010-1111-1111");
        defaultMember.setName("admin");
        defaultMember.setDeleted(false);

        defaultMember = memberRepository.save(defaultMember);
    }

    @Test
    public void save(){

        Member findMember = memberRepository.findOne(defaultMember.getIdx());

        assertThat(defaultMember).isEqualTo(findMember);
    }

    @Test
    public void deleted(){

        Long idx = defaultMember.getIdx();
        memberRepository.delete(idx);
        Member findMember = memberRepository.findOne(idx);
        assertThat(findMember).isEqualTo(null);
    }
}
