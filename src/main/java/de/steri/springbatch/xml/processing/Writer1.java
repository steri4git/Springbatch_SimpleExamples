package de.steri.springbatch.xml.processing;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import de.steri.springbatch.xml.processing.domain.Datei;


/**
 * Dummy {@link ItemWriter} which only logs data it receives.
 */
@Component("xmlItemWriter1")
public class Writer1 implements ItemWriter<Object> {

	private static final Log log = LogFactory.getLog(Writer1.class);
	
	/**
	 * @see ItemWriter#write(java.util.List)
	 */
	public void write(List<? extends Object> data) throws Exception {
		System.out.println("WRITER 1 AUFGERUFEN");
		if (data != null){
			System.out.println("Anzahl der Items: " + data.size());
			for (Object object : data) {
				Datei datei = (Datei)object;
				System.out.println("Anzahl Personen: " + datei.getPersonen().size());
			}
		}
		log.info(data);
	}
}
