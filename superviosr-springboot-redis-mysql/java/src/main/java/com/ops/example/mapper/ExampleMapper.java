package com.ops.example.mapper;

import com.ops.example.pojo.DemoUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xujm
 */
@Mapper
public interface ExampleMapper {

    DemoUser getUserById(@Param("id") Integer id);
}
