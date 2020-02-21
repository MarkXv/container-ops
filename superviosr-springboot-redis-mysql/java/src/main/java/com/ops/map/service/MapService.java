package com.ops.map.service;

import com.ops.example.pojo.DemoUser;
import com.ops.map.mapper.MapMapper;
import com.ops.map.pojo.MapPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MapService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean savePoint(MapPojo mapPojo){
        String sql = "insert into map_point(addr,`desc`,name,phone,`level`,lat,lng) value ('";
        sql = sql + mapPojo.getAddr() + "','"
                + mapPojo.getDesc() + "','"
                + mapPojo.getName() + "','"
                + mapPojo.getPhone() + "',"
                + mapPojo.getLevel() + ",'"
                + mapPojo.getLat() + "','"
                + mapPojo.getLng() + "');";

        try{
            jdbcTemplate.execute(sql);
            //mapMapper.savePoint(mapPojo);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


    public List<MapPojo> getMapPojoList(){
        List<MapPojo> result = new ArrayList<>();

        String sql = "select * from map_point";
        result = jdbcTemplate.query(sql, new BeanPropertyRowMapper<MapPojo>(MapPojo.class));
        //jdbcTemplate.new
        return result;
    }
}
