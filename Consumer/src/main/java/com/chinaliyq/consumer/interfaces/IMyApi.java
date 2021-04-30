package com.chinaliyq.consumer.interfaces;

import com.chinaliyq.consumer.beans.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Author: liyq
 * @Description: springcloud-t
 * @Date: 2021/4/30 - 14:36
 * @Version: 1.0
 **/
@FeignClient(name = "consumer-provider",url = "http://localhost:80")
//@FeignClient(name = "consumer",url = "http://provider")
public interface IMyApi {

    @GetMapping("/alive")
    String getAlive();

    @RequestMapping("/getMap")
    Map getMap();

    @RequestMapping("/getPerson")
    Map getPerson();

    @RequestMapping("/postPerson")
    Person postPerson(Person person);
}
