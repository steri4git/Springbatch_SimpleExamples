/**
 * 
 */
package de.steri.springbatch.simple.processing;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;


/**
 * @author Nutzer
 *
 */
@Component ("processor1")

public class Processor1 implements ItemProcessor<String, String >  {

	public String process(String item) throws Exception {
		System.out.println("PROCESSOR 1 AUFGERUFEN");
		item.concat(" processed");
		return item;
	}

}
