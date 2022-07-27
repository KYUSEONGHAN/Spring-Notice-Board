package com.example.springnoticeboard.controller;

import com.example.springnoticeboard.domain.ResultVO;
import org.springframework.web.bind.annotation.*;

@RestController   // json, xml 등의 resource를 리턴해줄수 있도록 해주는 기능
public class HelloController {
    // GET과 POST 둘 다 허용
    @RequestMapping("/hello")  // 받아들이는 url 경로를 의미 -> localhost:8080/hello
    public String hello() {
        return "Hello test";
    }

    // GET만 허용
    @GetMapping("/hello2")
    public String hello2() {
        return "Hello GET test";
    }

    // GET 메서드 + query parameter
    @GetMapping("/hello3")   // ex: localhost:8080/hello3?name=gildong
    public String hello3(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    // GET 메서드 + uri parameter
    @GetMapping("/hello32/{name}")  // ex: http://localhost:8080/hello32/gildong
    public String hello32(@PathVariable String name) {
        return "Hello" + name;
    }

    // POST + query parameter
    // POST 메서드로 보내면서 query parameter로 데이터를 보내는 예제
    @PostMapping("/hello33")
    public String hello33(@RequestParam("name") String name) {
        return "Hello" + name;
    }

    // POST
    // ex: 회원가입같은 경우에 대표적으로 사용
    // postman으로 테스트할 시, url: http://localhost:8080/hello4
    // x-www-form-urlencoded 선택
    // key와 value에 name, gildeong을 넣는다
    @PostMapping("/hello4")
    public String hello4(@RequestParam String name) {
        return "Hello " + name;
    }

    // JSON data return
    // return type이 ResultVO 객체이다
    // 객체를 리턴하게 되면 스프링프레임워크에 jackson mapper 라이브러리 자바 객체를 json으로 변환해주는 역할을 수행한다.
    @PostMapping("/hello5")
    public ResultVO hello5(@RequestParam("name") String name) {
        ResultVO result = new ResultVO(0, name);

        return result;
    }

    // Request - JSON data 보내기
    @PostMapping("/hello6")
    public ResultVO hello6(@RequestBody ResultVO result) {
        return result;
    }
}
