package com.app.playlist.contoller;


import java.util.HashMap;
import java.util.Map;


/************************************************************************************
 *         @author            Manas Agarwal
 *         Description        It is a controllerAdvice class which allows to handle exceptions across 
 *                            the whole application in one global handling component.
 *                          
 *                        
 *         Version            1.0
 *         Created Date       8-Aug-2022
 ************************************************************************************/

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.playlist.exception.SongException;


@RestControllerAdvice
public class SongControllerAdvice {
	@ExceptionHandler(SongException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleSongException(SongException e)
	{
		return e.getMessage();
	}
	
	/************************************************************************************
	 * Method:                                       handleValidateException
     *Description:                                   To handle all the validation violations.
	 * @param MethodArgumentNotValidException      -Error object of data type MethodArgumentNotValidException
	 * @returns             -
	      
                                    
	 
	 ************************************************************************************/
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	    
	    ex
	    .getBindingResult()
	    .getAllErrors()
	    .forEach(
	    		(error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
	}
}


