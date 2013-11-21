package de.steri.springbatch.complex.processing;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

/**
 * {@link ItemReader} with hard-coded input data.
 */

@Component("reader3")
public class Reader3 implements ItemReader<String> {
	
	private String[] input = {"Hello 31", "Hello 32","Hello 33","Hello 34","Hello 35","Hello 36",};
	
	private int index = 0;
	
	/**
	 * Reads next record from input
	 */
	public String read() throws Exception {
		System.out.println("READER 3 AUFFERUFEN");
		if (index < input.length) {
			return input[index++];
		}
		else {
			return null;
		}
		
	}
}
