package com.shuaiyu.handler;

import com.shuaiyu.exceptions.BusinessException;
import com.shuaiyu.exceptions.ParamsException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lsy on 2018/11/9 0009.
 *
 * @author Administrator
 */
@Component
public class MyExceptionHandler implements HandlerExceptionResolver{

    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response,
                                         Object target, Exception ex) {
        ModelAndView mv = new ModelAndView();
        //设置默认信息
        //设置默认错误页面
        mv.setViewName("error");
        //设置默认异常信息
        mv.addObject("ex", ex);
        //区分代码
        if (ex instanceof ParamsException){
            System.out.println("ParamsException");
            ParamsException e = (ParamsException) ex;
            //ex是变量 和前台的el表达式一致就可以
            mv.addObject("ex", e.getMsg());
            mv.setViewName("params");
        }
        if (ex instanceof BusinessException){
            System.out.println("ParamsException");
            BusinessException e = (BusinessException) ex;
            //ex是变量 和前台的el表达式一致就可以
            mv.addObject("ex", e.getMsg());
            mv.setViewName("params");
        }

        return mv;
    }
}
