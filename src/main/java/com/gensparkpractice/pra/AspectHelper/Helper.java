package com.gensparkpractice.pra.AspectHelper;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Pointcut;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
@Aspect
public class Helper {

    //@Pointcut("execution(* com.gensparkpractice.pra(..))")
    //private void selectAll(){}
    @Before("execution(call())")
    public void log(){
        System.out.println("logging out the information");
    }
}
