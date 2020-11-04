package com.pde.nvt.aops;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class TimeTracker.
 * @author Debadatta Mishra
 */
@Aspect

/** The Constant log. */

/** The Constant log. */
@Slf4j
@Component
public class TimeTracker {

	/**
	 * Log time.
	 *
	 * @param joinPoint the join point
	 * @return the object
	 * @throws Throwable the throwable
	 */
	@Around("@annotation(LogTime)")
	public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		final Object proceed = joinPoint.proceed();
		stopWatch.stop();
		log.debug("{} executed in {} ms", joinPoint.getSignature(), stopWatch.getTotalTimeMillis());

		return proceed;
	}

}
