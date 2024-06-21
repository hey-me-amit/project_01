package com.app.playlist.service;

import java.sql.SQLException;
import java.util.List;

import com.app.playlist.dto.Artist;
import com.app.playlist.exception.ArtistException;

public interface ArtistService {
Artist createArtist(Artist artist) throws ArtistException, SQLException;
	
	Artist getArtistById(Integer artistId) throws ArtistException, SQLException;
	
	void deleteArtistById(Integer artistId) throws ArtistException, SQLException;
	
	List<Artist> getAllArtist() throws ArtistException, SQLException;
	

}