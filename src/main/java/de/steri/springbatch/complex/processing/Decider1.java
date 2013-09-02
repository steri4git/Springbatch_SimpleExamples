package de.steri.springbatch.complex.processing;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;

public class Decider1 implements JobExecutionDecider {

	public FlowExecutionStatus decide(JobExecution jobExecution,
			StepExecution stepExecution) {
		System.out.println("DECIDER1 AUGERUFEN");
		
		return new FlowExecutionStatus("STEP4");
		//return new FlowExecutionStatus("STEP4");
	}

}
