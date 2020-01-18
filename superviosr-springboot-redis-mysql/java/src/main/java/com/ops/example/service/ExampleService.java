package com.ops.example.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ops.example.pojo.DemoUser;
import com.ops.example.utils.mariadb.MariadbConnect;
import com.ops.example.utils.redis.RedisConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.awt.print.Book;


@Service
public class ExampleService {

    @Autowired
    private MariadbConnect mariadbConnect;

    @Autowired
    private RedisConnect redisConnect;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private ObjectMapper objectMapper = new ObjectMapper();

    public String getData(int status){
        String result = "";
        switch (status){

            case 1 : result = getDataFromMariadb(); break;
            case 2 : result = getDataFromRedis(); break;
            default: result = "";
        }

        return result;
    }


    private String getDataFromRedis(){

        String result = "";

        ValueOperations<String ,Object> valueOperations = redisTemplate.opsForValue();

        String key = "user";

        String data = (String) valueOperations.get(key);
        if (data == null){
            data = getDataFromMariadbNative();

            valueOperations.append(key,data);
            result = "<html><body><h3>"+ "data form mariadb ：" + data +"</h3></body></html>";
        } else {
            result = "<html><body><h3>"+ "data form reids ：" + data +"</h3></body></html>";
        }
        return result;
    }

    private String getDataFromMariadb(){

        String result = "<html><body><h3>"+ "data form mariadb ：" + getDataFromMariadbNative() +"</h3></body></html>";
        return result;
    }

    private String getDataFromMariadbNative(){
        String sql = "SELECT id,username,sex ,city FROM ops_user";

        String data = jdbcTemplate.query(sql, new BeanPropertyRowMapper(DemoUser.class)).get(0).toString();
        try {
            data = objectMapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return data;
    }




}
