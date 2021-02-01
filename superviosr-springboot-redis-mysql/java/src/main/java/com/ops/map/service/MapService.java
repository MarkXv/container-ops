package com.ops.map.service;

import com.ops.map.mapper.MapMapper;
import com.ops.map.pojo.MapPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用my
 */
@Service
public class MapService {
//    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private MapMapper mapMapper;

    public boolean savePoint(MapPojo mapPojo){
//        String sql = "insert into map_point(addr,`desc`,name,phone,`level`,lat,lng) value ('";
//        sql = sql + mapPojo.getAddr() + "','"
//                + mapPojo.getDesc() + "','"
//                + mapPojo.getName() + "','"
//                + mapPojo.getPhone() + "',"
//                + mapPojo.getLevel() + ",'"
//                + mapPojo.getLat() + "','"
//                + mapPojo.getLng() + "');";

        try{
            mapMapper.savePoint(mapPojo);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


    public List<MapPojo> getMapPojoList(){
        List<MapPojo> result = new ArrayList<>();

        result = mapMapper.getPointList();
        //jdbcTemplate.new
        return result;
    }
}
