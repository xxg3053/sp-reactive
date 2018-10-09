package com.kf.flux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kf.flux
 * @Description: Test
 * @date 2018/10/9 下午1:40
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String test(){
        return "Hello world!";
    }

    @GetMapping("/helloFlux")
    public Mono<String> test1(){
        return Mono.just("Hello world, flux");
    }
}
