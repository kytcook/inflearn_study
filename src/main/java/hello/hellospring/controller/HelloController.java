package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
            model.addAttribute("data","hello!!");
            return "hello";
        }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("name",name);
        return "hello-template";
    }
    /*****************************************
     * @ResponseBody
     * 소스보기를 해보면 아래 문자를 그대로 내려준다.
     * 위의 hello-mvc 경우 html태그가 그대로 노출된다.
     * Spring container 에는 HttpMessageConverter가 있다.
     * 아래 hello-api 경우 객체를 반환하며, 객체봔환시 Spring의 HttpMessageConverter라는 메서드가 JSON형식으로 변환해줌
     *****************************/
    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;
    }
}
