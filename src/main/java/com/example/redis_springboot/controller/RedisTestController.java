package com.example.redis_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: redis_springboot
 * @BelongsPackage: com.example.redis_springboot.controller
 * @Author: hai
 * @CreateTime: 2023-03-30  19:10
 * @Version: 1.0
 */

@RestController
@RequestMapping("/redisTest")
public class RedisTestController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping
    public String testRedis() {
        //设置值到redis
        redisTemplate.opsForValue().set("name", "lucy");
        String name = (String) redisTemplate.opsForValue().get("name");
        return name;
    }
}
