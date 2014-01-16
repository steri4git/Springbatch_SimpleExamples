package de.steri.springbatch.jdbc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.steri.springbatch.jdbc.processing.PersonJDBCTemplates;

@ContextConfiguration(locations={"/jdbc-launch-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class JdbcJobTest {
	
	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job job;
	
	@Autowired
	private PersonJDBCTemplates personJDBCTemplates;
	
	@Test
	public void testSimpleProperties() throws Exception {
		assertNotNull(jobLauncher);
	}
	
	@Test
	public void testLaunchJob() throws Exception {
		jobLauncher.run(job, new JobParameters());
		System.out.println(personJDBCTemplates.readData());
		
	}
}
