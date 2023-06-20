package com.example.springboot.exception;

public class RecordNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RecordNotFoundException(String string){
        super("Could not find record " + string);

    }
}
