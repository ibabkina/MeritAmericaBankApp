package org.merit.securityjwt.backend_bankapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MissingDataException extends Exception {
	
	public MissingDataException(String message) {
		super(message);
	}

}
