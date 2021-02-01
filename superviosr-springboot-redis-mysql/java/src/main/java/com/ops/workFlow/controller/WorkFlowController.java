package com.ops.workFlow.controller;

import com.ops.workFlow.pojo.WorkFlow;
import com.ops.workFlow.service.WorkFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("workFlow")
public class WorkFlowController {

    @Autowired
    private WorkFlowService workFlowService;

    @PostMapping("/add")
    public WorkFlow andWorkFlow(WorkFlow workFlow){

        WorkFlow workFLow = workFlowService.addWorkFlow(workFlow);

        return workFLow;
    }

    @GetMapping("/list")
    public List<WorkFlow> getWorkFlow(){

        List<WorkFlow> workFlows = workFlowService.getWorkFlows();

        return workFlows;
    }

}
