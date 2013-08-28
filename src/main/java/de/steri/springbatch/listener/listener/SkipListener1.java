package de.steri.springbatch.listener.listener;

import org.springframework.batch.core.SkipListener;

public class SkipListener1<T, S> implements SkipListener<T, S> {

	public void onSkipInRead(Throwable t) {
		System.out.println("***SkipListener1 onSkipInRead AUFGERUFEN***");
		
	}

	public void onSkipInWrite(S item, Throwable t) {
		System.out.println("***SkipListener1 onSkipInWrite AUFGERUFEN***");
		
	}

	public void onSkipInProcess(T item, Throwable t) {
		System.out.println("***SkipListener1 onSkipInProcess AUFGERUFEN***");
		
		
	}
}
