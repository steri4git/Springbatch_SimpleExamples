package de.steri.springbatch.complex.processing;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import de.steri.springbatch.complex.processing.exception.RetryableException;
import de.steri.springbatch.complex.processing.exception.SkipableException;


/**
 * Dummy {@link ItemWriter} which only logs data it receives.
 */
@Component("writer3")
public class Writer3 implements ItemWriter<Object> {

	private static final Log log = LogFactory.getLog(Writer3.class);
	
	/**
	 * @see ItemWriter#write(java.util.List)
	 */
	public void write(List<? extends Object> data) throws SkipableException, RetryableException, Exception {
		System.out.println("WRITER 3 AUFGERUFEN");
		if (data != null){
			System.out.println("Anzahl der Items: " + data.size());
			log.info(data);
			//throw new Exception();
			//throw new SkipableException();
			throw new RetryableException();
		}
		//log.info(data);
	}
}
