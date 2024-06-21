package com.app.playlist.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.playlist.dao.PlaylistRepository;
import com.app.playlist.dao.SongRepository;
import com.app.playlist.dto.Playlist;
import com.app.playlist.dto.Song;
import com.app.playlist.exception.PlaylistException;
@Service
public class PlaylistServiceImpl implements PlaylistService {
	
	@Autowired
	private PlaylistRepository playlistRepository;
	
	@Autowired
	private SongRepository songRepository;

	@Override
	public Playlist createPlaylist(Playlist playlistObj) throws PlaylistException, SQLException {
		// TODO Auto-generated method stub
		return this.playlistRepository.save(playlistObj);
		
	
	
	}
	@Override
	public Playlist getPlaylistById(Integer playlistId) throws PlaylistException, SQLException {
		// TODO Auto-generated method stub
		Optional<Playlist> playlist = this.playlistRepository.findById(playlistId);
		if(playlist.isEmpty()) {
			throw new PlaylistException("Given Playlist id does not exist");
		}else {
			return playlist.get();
		}
	}
	
	

	@Override
	public void deletePlaylistById(Integer playlistId) throws PlaylistException, SQLException {
		// TODO Auto-generated method stub
		Optional<Playlist> playlist = this.playlistRepository.findById(playlistId);
		if(playlist.isEmpty()) {
			throw new PlaylistException("Given Playlist id does not exist");
		}else {
			this.playlistRepository.deleteById(playlistId);
		}
	
		
	}

	@Override
	public List<Playlist> getAllPlaylists() throws PlaylistException, SQLException {
		// TODO Auto-generated method stub
		return this.playlistRepository.findAll();
	}
	public Playlist updatePlaylist(Playlist playlistObj) throws PlaylistException {
		Optional<Playlist> playlist=this.playlistRepository.findById(playlistObj.getPlayListId());
		if(playlist.isEmpty()) {
			throw new PlaylistException("playlist id does not exist");
		}
		return this.playlistRepository.save(playlistObj);
		}

	}
	
	
	


