package com.app.playlist;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.playlist.exception.ArtistException;
import com.app.playlist.exception.PlaylistException;
import com.app.playlist.service.ArtistService;

@SpringBootTest
public class ArtistTest {
	@Autowired
	private ArtistService artistService;
	
	@Test
	public void getArtistByIdTest() throws PlaylistException,SQLException {
		assertThrows(ArtistException.class,
				()->artistService.getArtistById(3));
	
	}
	@Test
	public void getArtistByIdTesti_negative() throws ArtistException,SQLException {
		
		
		artistService.getArtistById(34);
	
	}
	@Test
	public void deleteArtistByIdTest() throws ArtistException,SQLException {
		assertThrows(ArtistException.class,
				()->artistService.deleteArtistById(31));
	
	}
	@Test
	public void deleteArtistByIdTesti_negative() throws ArtistException,SQLException {
		artistService.deleteArtistById(34);
	
	}

	
	@Test
	public void getAllArtistTest() throws ArtistException,SQLException{
		
		assertNotNull(this.artistService.getAllArtist());
	}
	



}
