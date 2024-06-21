package com.app.playlist.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.app.playlist.dto.Song;
import com.app.playlist.exception.SongException;


public interface SongService {
Song addSong(Song song) throws SongException;
	
	Song getSongById(Integer songId) throws SongException;
	
	void deleteSongById(Integer songId) throws SongException;
	
	List<Song> getAllSongs() throws SongException;
	
	Song updateSong(Song song) throws SongException;
	


	

}
