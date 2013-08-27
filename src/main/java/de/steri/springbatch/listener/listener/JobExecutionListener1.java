package de.steri.springbatch.listener.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component("listener1")
public class JobExecutionListener1 implements JobExecutionListener  {

	public void beforeJob(JobExecution jobExecution) {
		System.out.println("LISTENER 1 BEFORE JOB");
		
	}

	public void afterJob(JobExecution jobExecution) {
		System.out.println("LISTENER 1 AFTER JOB");
		
	}

}
