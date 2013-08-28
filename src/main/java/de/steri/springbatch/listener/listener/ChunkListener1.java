package de.steri.springbatch.listener.listener;

import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

public class ChunkListener1 implements ChunkListener{

	public void beforeChunk(ChunkContext context) {
		System.out.println("***ChunkListener1 beforeChunk AUFGERUFEN***");
		
	}

	public void afterChunk(ChunkContext context) {
		System.out.println("***ChunkListener1 afterChunk AUFGERUFEN***");
		
	}

	public void afterChunkError(ChunkContext context) {
		System.out.println("***ChunkListener1 afterChunkError AUFGERUFEN***");
	}
}
