package de.steri.springbatch.listener.listener;

import org.springframework.batch.core.ItemProcessListener;
import org.springframework.stereotype.Component;

	@Component("itemProcessListener1")
	public class ItemProcessListener1<T extends Object, S> implements ItemProcessListener<T, S>  {

		public void beforeProcess(T item) {
			
			System.out.println("***itemProcessListener1 beforeProcess AUFGERUFEN***");
			
		}

		public void afterProcess(T item, S result) {
			System.out.println("***itemProcessListener1 afterProcess AUFGERUFEN***");
			
		}

		public void onProcessError(T item, Exception e) {
			System.out.println("***PROCESSLISTENER1 onProcessError AUFGERUFEN***");
		}
	}