package com.jsen.test.controller;

import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * </p>
 *
 * @author ${User}
 * @since 2018/4/3
 */
@RestController
@CrossOrigin
@RequestMapping("/dom")
public class TestController {
    @GetMapping("/echo/{name}")
    public String echo(@PathVariable("name") String name) {
        return "hello " + name;
    }
}
