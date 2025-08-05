package com.next.app.api.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello Controller", description = "안녕하세요~~~~인사를 입력해보세요")
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "Hello selee 인사", description = "안녕하세요 간단한 인사말을 반환합니다.")
    public String hello() {
        return "안녕하세요! selee";
    }
} 