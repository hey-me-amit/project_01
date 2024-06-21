package com.app.playlist;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.playlist.dto.Playlist;
import com.app.playlist.exception.PlaylistException;
import com.app.playlist.service.PlaylistServiceImpl;

@SpringBootTest
public class PlaylistTest {
	
	@Autowired 
	private PlaylistServiceImpl playlistService;
	

		
	@Test
	public void getPlaylistByIdTest() throws PlaylistException,SQLException {
		//Playlist playlist = playlistService.getPlaylistById(12);
		assertThrows(PlaylistException.class,
				()->playlistService.getPlaylistById(4));
	
	}
	@Test
	public void getPlaylistByIdTesti_negative() throws PlaylistException,SQLException {
		
		
				playlistService.getPlaylistById(6);
	
	}
	@Test
	public void updatePlaylistByIdTest() throws PlaylistException,SQLException {
		Playlist playlist = playlistService.getPlaylistById(4);
		assertThrows(PlaylistException.class,
				()->playlistService.updatePlaylist(playlist));
	
	}
	@Test
	public void updatePlaylistByIdTesti_negative() throws PlaylistException,SQLException {
		Playlist playlist = playlistService.getPlaylistById(4);
		assertNotNull(
				playlistService.updatePlaylist(playlist));
	
	}
	@Test
	public void deletePlaylistByIdTest() throws PlaylistException,SQLException {
		//Playlist playlist = playlistService.getPlaylistById(12);
		assertThrows(PlaylistException.class,
				()->playlistService.deletePlaylistById(8));
	
	}
	@Test
	public void deletePlaylistByIdTesti_negative() throws PlaylistException,SQLException {
		playlistService.deletePlaylistById(6);
	
	}

	
	@Test
	public void getAllPlaylistsTest() throws PlaylistException,SQLException{
		
		assertNotNull(this.playlistService.getAllPlaylists());
	}
	


}