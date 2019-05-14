package com.nice.controller;

import com.nice.domain.UserVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/testAspect",method = RequestMethod.GET)
    public UserVo test(){
        UserVo userVo = new UserVo();
        userVo.setAge(24);
        userVo.setName("nice");
        userVo.setSex("男");
        return userVo;
    }

    @RequestMapping(value = "/testAspectArgs",method = RequestMethod.GET)
    public UserVo test(String name,Integer age,String sex){
        UserVo userVo = new UserVo();
        userVo.setName(name);
        userVo.setAge(age);
        userVo.setSex(sex);
        return userVo;
    }
}
