package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    /**
     * 하나의 테스트가 끝난 후 콜백
     */
//    @AfterEach
//    public void afterEach(){
//        repository.clearStore();
//    }

//    @Test
//    public void save(){
//        // 저장할 member 객체 생성
//        Member member = new Member();
//        member.setName("spring");
//
//        // 저장
//        repository.save(member);
//
//        // 검증
//        Member result = repository.findById(member.getId()).get();
//        assertThat(member).isEqualTo(result);   // assertj.core.api
//    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();
        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();
        assertThat(result.size()).isEqualTo(2);
    }

}
