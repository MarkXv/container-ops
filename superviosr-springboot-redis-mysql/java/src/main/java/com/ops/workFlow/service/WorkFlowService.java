package com.ops.workFlow.service;

import com.ops.workFlow.pojo.WorkFlow;

import java.util.List;

public interface WorkFlowService {
    WorkFlow addWorkFlow(WorkFlow workFlow);

    List<WorkFlow> getWorkFlows();
}
