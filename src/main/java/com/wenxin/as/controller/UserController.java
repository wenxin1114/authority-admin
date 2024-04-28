package com.wenxin.as.controller;

import com.wenxin.as.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/list")
    public Result list() {
        return Result.ok("list");
    }
}
