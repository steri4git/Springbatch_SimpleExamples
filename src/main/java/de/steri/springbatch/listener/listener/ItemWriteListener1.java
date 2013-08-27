package de.steri.springbatch.listener.listener;

import java.util.List;

import org.springframework.batch.core.ItemWriteListener;
import org.springframework.stereotype.Component;

@Component("itemWriteListener1")
public class ItemWriteListener1<S extends Object> implements ItemWriteListener<S> {

	public void beforeWrite(List<? extends S> items) {
		System.out.println("***ItemWriteListener1 beforeWrite AUFGERUFEN***");
		
	}

	public void afterWrite(List<? extends S> items) {
		System.out.println("***ItemWriteListener1 afterWrite AUFGERUFEN***");
		
	}

	public void onWriteError(Exception exception, List<? extends S> items) {
		System.out.println("***ItemWriteListener1 onWriteError AUFGERUFEN***");
		
	}
}
