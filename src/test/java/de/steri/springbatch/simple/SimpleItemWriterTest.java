package de.steri.springbatch.simple;

import de.steri.springbatch.simple.processing.Writer1;

import junit.framework.TestCase;

public class SimpleItemWriterTest extends TestCase {

	private Writer1 writer = new Writer1();
	
	public void testWrite() throws Exception {
		writer.write(null); // nothing bad happens
	}

}
