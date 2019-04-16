package com.example.hellodemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * </p>
 *
 * @author xianLing.zhou
 * @since 2019/4/15
 */
@Controller //Spring MVC注解。表示用于负责Web请求
public class HelloController {

    @GetMapping("/hello.html")  //表示请求路径
    public @ResponseBody
    String hello() {
        return "Hello，Spring Boot";
    }
}
