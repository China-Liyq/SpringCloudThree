package com.chinaliyq.consumer.controller;

import com.chinaliyq.consumer.beans.Person;
import com.chinaliyq.consumer.interfaces.IMyApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Author: liyq
 * @Description: springcloud-t
 * @Date: 2021/4/30 - 14:27
 * @Version: 1.0
 **/
@RestController
public class MainController {
    @Value("${server.port}")
    String port;

    @Autowired
    IMyApi myApi;

    @GetMapping("/getAlive")
    String getAlive(){
        System.out.println("consumer端口：" + port);
        return myApi.getAlive();
    };

    @RequestMapping("/getMap")
    Map getMap(){
        System.out.println("端口：" + port);
        return myApi.getMap();
    };

    @RequestMapping("/getPerson")
    Map getPerson(){
        System.out.println("端口：" + port);
        return myApi.getPerson();
    };

    @RequestMapping("/postPerson")
    Person postPerson(@RequestParam("name") String name,
                      @RequestParam("sex") char sex,
                      @RequestParam("age") int age){
        System.out.println(55);
        Person person = new Person(name, sex, age);
        System.out.println(person);
        System.out.println("端口：" + port);
        return myApi.postPerson(person);
    };

}
