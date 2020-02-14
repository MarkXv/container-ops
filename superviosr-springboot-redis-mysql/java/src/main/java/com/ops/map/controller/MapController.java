package com.ops.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试地图功能禁用Rest
 */
@Controller
@RequestMapping("map/")
public class MapController {
    /**
     * 跳转到地图
     * @return
     */
    @GetMapping("toMap")
    public String toMapHtml(){
        System.out.println("test");
        return "/demo/map.html";
    }
}
