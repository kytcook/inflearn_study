package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private MemberService memberService;

    /**************************************
     * @Autowired
     * 스프링 컨테이너에 있는 멤버서비스와 연결해준다.
     * -----
     * 생성자 의존성 주입
     *************************************/
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
