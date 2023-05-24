package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 스프링 JPA를 상속받으면, 인터페이스를 자동으로 구현해준다.
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{

    // JPQL select m from Member mm where m.name = ?
    @Override
    Optional<Member> findByName (String name);
}
