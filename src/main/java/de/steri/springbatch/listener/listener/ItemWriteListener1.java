package de.steri.springbatch.listener.listener;

import java.util.List;

import org.springframework.batch.core.ItemWriteListener;

public class ItemWriteListener1<S> implements ItemWriteListener<S> {

	public void beforeWrite(List<? extends S> items) {
		// TODO Auto-generated method stub
		
	}

	public void afterWrite(List<? extends S> items) {
		// TODO Auto-generated method stub
		
	}

	public void onWriteError(Exception exception, List<? extends S> items) {
		// TODO Auto-generated method stub
		
	}

}
