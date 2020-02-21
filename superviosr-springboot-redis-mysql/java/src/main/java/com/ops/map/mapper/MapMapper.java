package com.ops.map.mapper;

import com.ops.map.pojo.MapPojo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface MapMapper {

    public void savePoint(MapPojo mapPojo);
}
