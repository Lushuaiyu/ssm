package com.shuaiyu.controller;

import com.shuaiyu.exceptions.BusinessException;
import com.shuaiyu.exceptions.ParamsException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lsy on 2018/11/9 0009.
 *
 * @author Administrator
 */
@Controller
@RequestMapping("exception")
public class ExceptionController {
    @RequestMapping("test1")
    @ResponseBody
    public String test1(){
        if (true){
            throw new ParamsException(300, "exception!!!!");
        }
        return "exception help!!!!";
    }
    @RequestMapping("test2")
    @ResponseBody
    public String test2(){
        if (true){
            throw new RuntimeException("exception!!!!");
        }
        return "exception help!!!!";
    }
    @RequestMapping("test3")
    @ResponseBody
    public String test3(){
        if (true){
            throw new BusinessException(500, "exception!!!!");
        }
        return "exception help!!!!";
    }

}
