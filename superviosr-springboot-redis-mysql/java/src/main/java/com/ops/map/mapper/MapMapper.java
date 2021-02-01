package com.ops.map.mapper;

import com.ops.map.pojo.MapPojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MapMapper {

    public void savePoint(MapPojo mapPojo);

    List<MapPojo> getPointList();
}
