package de.steri.springbatch.listener.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component("jobExecutionListener1")
public class JobExecutionListener1 implements JobExecutionListener  {

	public void beforeJob(JobExecution jobExecution) {
		System.out.println("***JobExecutionListener1 beforeJob AUFGERUFEN***");
		
	}

	public void afterJob(JobExecution jobExecution) {
		System.out.println("***JobExecutionListener1 afterJob AUFGERUFEN***");
		
	}
}
