package com.codewith.web;

import com.codewith.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// RestController: 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어준다.
@RestController
public class HelloController {
    
    // GetMapping: HTTP Method인 GET의 요청을 받을 수 있는 API를 만들어준다. 예전에는 RequestMapping으로 사용되었다.
    // /hello로 요청이 오면 문자열 hello를 반환하는 기능
    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
