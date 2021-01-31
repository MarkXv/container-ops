package com.ops.example.controller;

import com.ops.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/example")
public class ExampleController {

    private static final int MARIADB_CONFIG = 1;
    private static final int REDIS_CONFIG = 2;
    private static final int NO_CONFIG = 0;


    @Value("${spring.redis.host}")
    private String redisHost;

    @Value("${spring.datasource.url}")
    private String mysqlHost;

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/getDBDataInfo/{id}")
    @ResponseBody
    public String getDataInfo(@PathVariable Integer id) {
        return exampleService.getData(getConnectionStatus(),id);
    }

    public int getConnectionStatus() {

        String redisConfig = redisHost;
        String mariadbConfig = mysqlHost;

        if (redisConfig != null) {
            return REDIS_CONFIG;
        } else if (mariadbConfig != null) {
            return MARIADB_CONFIG;
        }
        return NO_CONFIG;
    }
}
