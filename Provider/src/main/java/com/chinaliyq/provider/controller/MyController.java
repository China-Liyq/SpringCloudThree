package com.chinaliyq.provider.controller;

import com.chinaliyq.provider.beans.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liyq
 * @Description: springcloud-t
 * @Date: 2021/4/30 - 14:28
 * @Version: 1.0
 **/
@RestController
public class MyController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/alive")
    public String getAlive(){
        return "getApi----,端口：" + port;
    }

    @RequestMapping("/getMap")
    public Map getMap(){
        HashMap<String, String> map = new HashMap<>();
        System.out.println(999);
        map.put("Map端口:",port);
        return map;
    }

    @RequestMapping("/getPerson")
    public Map getPerson(){
        HashMap<String, String> map = new HashMap<>();
        Person person = new Person("liuq", '男', 20);
        System.out.println("端口：" + port);
        System.out.println(999);
        map.put("person",person.toString());
        System.out.println(map);
        return map;
    }
    @RequestMapping("/postPerson")
    public Person postPerson(@RequestBody Person person){
        System.out.println("端口：" + port);
        System.out.println(person);
        return person;
    }

}
