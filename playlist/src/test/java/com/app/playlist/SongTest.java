package com.app.playlist;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.playlist.dto.Song;
import com.app.playlist.exception.PlaylistException;
import com.app.playlist.exception.SongException;
import com.app.playlist.service.SongService;

@SpringBootTest
class SongTest{
	
	@Autowired
	private SongService songService;
	
	@Test
	public void getSongByIdTest() throws SongException,SQLException {
		assertThrows(SongException.class,
				()->songService.getSongById(4));
	
	}
	@Test
	public void getSongByIdTesti_negative() throws SongException,SQLException {
		
		
		songService.getSongById(1);
	
	}
	@Test
	public void updateSongByIdTest() throws SongException,SQLException {
		Song song = songService.getSongById(35);
		assertThrows(SongException.class,
				()->songService.updateSong(song));
	
	}
	@Test
	public void updatePlaylistByIdTesti_negative() throws SongException,SQLException {
		Song song = songService.getSongById(5);
		assertNotNull(
				songService.updateSong(song));
	
	}
	@Test
	public void deleteSongByIdTest() throws SongException,SQLException {
		assertThrows(PlaylistException.class,
				()->songService.deleteSongById(11));
	
	}
	@Test
	public void deletePlaylistByIdTesti_negative() throws SongException,SQLException {
		songService.deleteSongById(1);
	
	}

	
	@Test
	public void getAllSongsTest() throws SongException,SQLException{
		
		assertNotNull(this.songService.getAllSongs());
	}
	
}

