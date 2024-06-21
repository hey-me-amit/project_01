package com.app.playlist;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.playlist.exception.AlbumException;
import com.app.playlist.service.AlbumService;

@SpringBootTest
public class AlbumTest {
	@Autowired
	private AlbumService albumService;
	
	@Test
	public void getAlbumByIdTest() throws AlbumException,SQLException {
		assertThrows(AlbumException.class,
				()->albumService.getAlbumById(4));
	
	}
	@Test
	public void getAlbumByIdTesti_negative() throws AlbumException,SQLException {
		
		
		albumService.getAlbumById(35);
	
	}
	@Test
	public void deleteAlbumByIdTest() throws AlbumException,SQLException {
		assertThrows(AlbumException.class,
				()->albumService.deleteAlbumById(8));
	
	}
	@Test
	public void deleteAlbumByIdTesti_negative() throws AlbumException,SQLException {
		albumService.deleteAlbumById(35);
	
	}

	
	@Test
	public void getAllAlbumsTest() throws AlbumException,SQLException{
		
		assertNotNull(this.albumService.getAllAlbums());
	}
	

	
	

}
