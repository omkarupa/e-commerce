package com.ou_solutions.productservice.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LoggingAspect {
	
	
	
	//Point Cut is defined which package method u want to log messages
	@Pointcut("execution(* com.ou_solutions.productservice.service.*.*(..))")
	public void serviceMethods() {}
	
	
	//Before Method Exceution it requires pointcut
	@Before("serviceMethods()")
	public void logBeforeMethodExecution(JoinPoint joinPoint)
	{
		String methodName = joinPoint.getSignature().getName();
		
		log.info( "Method Name : {} ",methodName);
		
		Object[] args = joinPoint.getArgs();
		
		log.info("Arguments Passed : ", Arrays.toString(args) );
	}
	
	
	//After Method Exceution returning values 
	// it requires pointcut ,returing
	@AfterReturning(pointcut = "serviceMethods()",returning = "result")
	public void logAfterReturning(JoinPoint joinPoint,Object result)
	{
		String methodName = joinPoint.getSignature().getName();
		
		log.info( "Method Name : {} ",methodName);
		log.info("Returning Value : ",result.toString() );
		
		
	}
	
	
	
	
	//After an exception has occurent 
	// it requires pointcut ,throwing 
	@AfterThrowing(pointcut = "serviceMethods()",throwing = "ex")
	public void handleException(JoinPoint joinPoint,Throwable ex)
	{
		String methodName = joinPoint.getSignature().getName();
		
		log.info( "Exception Occured in Method Name : {} ",methodName);
		log.info("Exception message : ",ex.getMessage());
	}
	

}
