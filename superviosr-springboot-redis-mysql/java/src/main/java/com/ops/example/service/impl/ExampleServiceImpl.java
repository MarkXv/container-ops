package com.ops.example.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ops.example.mapper.ExampleMapper;
import com.ops.example.pojo.DemoUser;
import com.ops.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;


/**
 * @author xujm
 */
@Service
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    private ExampleMapper exampleMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String getData(int status, Integer id) {
        String result = "";
        switch (status) {

            case 1:
                result = getDataFromMariadb(id);
                break;
            case 2:
                result = getDataFromRedis(id);
                break;
            default:
                result = "";
        }

        return result;
    }


    private String getDataFromRedis(Integer id) {

        String result = "";

        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();

        String key = "DemoUser" + id;

        String data = (valueOperations.get(key) != null) ? valueOperations.get(key).toString() : null;
        if (data == null) {
            data = getDataFromMariadbNative(id);
            valueOperations.set(key, data);
            result = "<html><body><h3>" + "data form mariadb ：" + data + "</h3></body></html>";
        } else {
            result = "<html><body><h3>" + "data form reids ：" + data + "</h3></body></html>";
        }
        return result;
    }

    private String getDataFromMariadb(Integer id) {

        String result = "<html><body><h3>" + "data form mariadb ：" + getDataFromMariadbNative(id) + "</h3></body></html>";
        return result;
    }

    private String getDataFromMariadbNative(Integer id) {

        String data = "";
        DemoUser result = exampleMapper.getUserById(id);

        try {
            data = objectMapper.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            data = "数据序列化错误！";
            e.printStackTrace();
        }

        return data;
    }

}
