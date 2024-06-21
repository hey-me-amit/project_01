package com.app.playlist.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.playlist.exception.ArtistException;


@RestControllerAdvice
public class ArtistControllerAdvice {
	@ExceptionHandler(ArtistException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleArtistException(Exception e)
	{
		return e.getMessage();
	}
}

