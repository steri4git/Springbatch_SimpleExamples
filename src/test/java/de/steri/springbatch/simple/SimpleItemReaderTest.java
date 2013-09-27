package de.steri.springbatch.simple; 

import de.steri.springbatch.simple.processing.Reader1;

import junit.framework.TestCase;

public class SimpleItemReaderTest extends TestCase {

	private Reader1 reader = new Reader1();
	
	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", reader.read());
	}

	public void testReadTwice() throws Exception {
		reader.read();
		assertEquals(null, reader.read());
	}

}
