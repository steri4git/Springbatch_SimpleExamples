package de.steri.springbatch.listener.listener;

import org.springframework.batch.core.ItemReadListener;

public class ItemReadListener1<T extends Object> implements ItemReadListener<T> {

	public void beforeRead() {
		System.out.println("***ItemReadListener1 beforeRead AUFGERUFEN***");
		
	}

	public void afterRead(T item) {
		System.out.println("***ItemReadListener1 afterRead AUFGERUFEN***");
		
	}

	public void onReadError(Exception ex) {
		System.out.println("***ItemReadListener1 onReadError AUFGERUFEN***");
		
	}
}
