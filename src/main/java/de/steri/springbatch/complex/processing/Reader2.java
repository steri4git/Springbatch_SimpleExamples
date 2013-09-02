package de.steri.springbatch.complex.processing;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

/**
 * {@link ItemReader} with hard-coded input data.
 */

@Component("reader2")
public class Reader2 implements ItemReader<String> {
	
	private String[] input = {"Hello 11", "Hello 22","Hello 33","Hello 44","Hello 55","Hello 66",};
	
	private int index = 0;
	
	/**
	 * Reads next record from input
	 */
	public String read() throws Exception {
		System.out.println("READER 1 AUFFERUFEN");
		if (index < input.length) {
			return input[index++];
		}
		else {
			return null;
		}
		
	}
}
