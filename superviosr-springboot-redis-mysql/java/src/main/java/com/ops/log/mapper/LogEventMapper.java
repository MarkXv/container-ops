package com.ops.log.mapper;

import com.ops.log.pojo.LogEvent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface LogEventMapper {
    public void saveLogEvent(LogEvent logEvent);

}
