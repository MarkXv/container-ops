package com.ops.workFlow.service.impl;

import com.ops.workFlow.pojo.WorkFlow;
import com.ops.workFlow.service.WorkFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WorkFlowServiceImpl implements WorkFlowService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public WorkFlow addWorkFlow(WorkFlow workFlow) {

        workFlow.setId(UUID.randomUUID().toString());

        WorkFlow workFlow1 = mongoTemplate.insert(workFlow);

        return workFlow;
    }

    @Override
    public List<WorkFlow> getWorkFlows() {
        List<WorkFlow> workFlows = mongoTemplate.findAll(WorkFlow.class);

        return workFlows;
    }
}
