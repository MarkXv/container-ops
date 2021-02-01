package com.ops.log.service;

import com.ops.log.mapper.LogEventMapper;
import com.ops.log.pojo.LogEvent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LogEventService {

    @Autowired
    private LogEventMapper logEventMapper;

    public void saveLogEvent(LogEvent logEvent){
        logEventMapper.saveLogEvent(logEvent);
    }


}
