package com.app.playlist.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.playlist.dto.Playlist;
import com.app.playlist.dto.Song;
import com.app.playlist.exception.PlaylistException;

@Service
public interface PlaylistService {
	Playlist createPlaylist(Playlist playlist) throws PlaylistException, SQLException;
	
	Playlist getPlaylistById(Integer playlistId) throws PlaylistException, SQLException;
	
	void deletePlaylistById(Integer playlistId) throws PlaylistException, SQLException;
	
	List<Playlist> getAllPlaylists() throws PlaylistException, SQLException;

	Playlist updatePlaylist(Playlist playlist) throws PlaylistException;
	
	
}