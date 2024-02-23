package com.lvksz.employeecrud.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.lvksz.employeecrud.controller.*.*(..))")
    private void controllerPackage() {}

    @Pointcut("execution(* com.lvksz.employeecrud.service.*.*(..))")
    private void servicePackage() {}

    @Pointcut("execution(* com.lvksz.employeecrud.dao.*.*(..))")
    private void daoPackage() {}

    @Pointcut("controllerPackage() || servicePackage() || daoPackage()")
    private void appFlow() {}

    @Before("appFlow()")
    public void before(JoinPoint joinPoint){
        String method = joinPoint.getSignature().toShortString();
        logger.info("===> Calling method: " + method);

        Object[] args = joinPoint.getArgs();
        for (Object arg : args){
            logger.info("===> Argument: " + arg);
        }
    }

    @AfterReturning(
            pointcut = "appFlow()",
            returning = "result"
    )
    public void afterReturning(
            JoinPoint joinPoint,
            Object result
    ){
        String method = joinPoint.getSignature().toShortString();
        logger.info("===> Returning form method: " + method);

        logger.info("===> Returned value: " + result);
    }
}
