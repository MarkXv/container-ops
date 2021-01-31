package com.ops.map.controller;

import com.ops.map.pojo.MapPojo;
import com.ops.map.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试地图功能禁用Rest
 */
@Controller
@RequestMapping("map/")
public class MapController {
    @Autowired
    private MapService mapService;

    /**
     * 跳转到地图
     * @return
     */
    @GetMapping("toMap")
    public String toMapHtml(){
        System.out.println("test");
        return "/demo/map.html";
    }

    @GetMapping("toMap1")
    public String toMapHtml1(){
        System.out.println("test");
        return "/demo/map1.html";
    }

    /**
     * 保存地点数据到数据库
     * @param mapPojo
     * @return
     */
    @PostMapping(value = "savePoint")
    @ResponseBody
    public String savePoint(@RequestBody MapPojo mapPojo){
        System.out.println(mapPojo);
        mapService.savePoint(mapPojo);
        return "新增成功！";
    }

    @GetMapping("getPoints")
    @ResponseBody
    public List<MapPojo> getMapPojos (){

        List<MapPojo> result = new ArrayList();
        result = mapService.getMapPojoList();
        return result;

    }
}
