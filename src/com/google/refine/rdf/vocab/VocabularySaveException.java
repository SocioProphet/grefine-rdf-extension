package com.google.refine.rdf.vocab;

import java.io.IOException;

@SuppressWarnings("serial")
public class VocabularySaveException extends IOException{
	public VocabularySaveException(String message, Throwable cause) {
		super(message, cause);
	}

}
