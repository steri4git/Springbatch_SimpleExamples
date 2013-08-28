package de.steri.springbatch.listener.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

@Component("stepExecutionListener1")
public class StepExecutionListener1 implements StepExecutionListener {

	public void beforeStep(StepExecution stepExecution) {
		System.out.println("***stepExecutionListener1 beforeStep AUFGERUFEN***");
		
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		System.out.println("***stepExecutionListener1 afterStep AUFGERUFEN***");
		return null;
	}
}
