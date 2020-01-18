package com.ops.example.controller;

import com.ops.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/example")
public class ExampleController {

    @Autowired
    Environment environment;

    private static final int MARIADB_CONFIG = 1;
    private static final int REDIS_CONFIG = 2;
    private static final int NO_CONFIG = 0;

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/getDBDataInfo")
    @ResponseBody
    public String getDataInfo() {
        return exampleService.getData(getConnectionStatus());
    }

    public int getConnectionStatus() {

        String redisConfig = environment.getProperty("spring.redis.host");
        String mariadbConfig = environment.getProperty("spring.datasource.url");

        if (redisConfig != null){
            return REDIS_CONFIG;
        } else if (mariadbConfig != null){
            return MARIADB_CONFIG;
        }
        return NO_CONFIG;
    }
}
