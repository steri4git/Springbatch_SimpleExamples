package de.steri.springbatch.complex.processing;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

/**
 * {@link ItemReader} with hard-coded input data.
 */

@Component("reader4")
public class Reader4 implements ItemReader<String> {
	
	private String[] input = {"Hello 41", "Hello 42","Hello 43","Hello 44","Hello 45","Hello 46",};
	
	private int index = 0;
	
	/**
	 * Reads next record from input
	 */
	public String read() throws Exception {
		System.out.println("READER 4 AUFFERUFEN! Thread-ID: " + Thread.currentThread().getId());
		if (index < input.length) {
			return input[index++];
		}
		else {
			return null;
		}
		
	}
}
