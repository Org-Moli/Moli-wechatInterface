package com.imory.test.controller;

import com.imory.test.dao.Demo;
import com.imory.test.dao.Test;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/27
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private static Logger logger = Logger.getLogger(TestController.class);


    @RequestMapping("/index")
    public String index()
    {
        logger.info("打印信息....");
        logger.error("错误信息....");
        logger.debug("debug信息.....");
        return "hello World";
    }

    @RequestMapping("/map")
    public Map<String, Object> map()
    {
        Map map = new HashMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", 3);
        return map;
    }

    @RequestMapping("/bean")
    public Test test()
    {
        Test test = new Test();
        test.setId(1);
        test.setName("test");
        return test;
    }

    @RequestMapping("/demo")
    public Demo demo()
    {
        Demo demo = new Demo();
        demo.setId(2);
        demo.setName("demo");
        demo.setDemo("remark");
        return demo;
    }
}
