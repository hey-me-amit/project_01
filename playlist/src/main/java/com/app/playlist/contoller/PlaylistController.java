package com.app.playlist.contoller;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.playlist.dto.Playlist;
import com.app.playlist.dto.Song;
import com.app.playlist.exception.PlaylistException;
import com.app.playlist.exception.SongException;
import com.app.playlist.service.PlaylistService;

import org.springframework.web.bind.annotation.RequestBody;

/************************************************************************************
 *         @author            Amit yadav
 *         Description        It is a controller class which is responsible for processing incoming REST API
 *                            request. Also returns the response to the client/server making the request 
 *                            by mapping the request URL to a controller method. 
 *                        
 *         Version            1.0
 *         Created Date       8-Aug-2022
 ************************************************************************************/
@RestController
public class PlaylistController {
	@Autowired
	private PlaylistService playlistService;
	
	@GetMapping("playlist/{id}")
	public Playlist getPlaylistById(@PathVariable("id") Integer id) throws PlaylistException, SQLException {
	return this.playlistService.getPlaylistById(id);
}
	

	@PostMapping("playlist")
	public Playlist addPlaylist(@Valid @RequestBody Playlist playlist) throws MethodArgumentNotValidException,PlaylistException, SQLException{
		System.out.println(playlist);
		return this.playlistService.createPlaylist(playlist);
	}
	
	@GetMapping("playlists")
	public List<Playlist> getAllPlaylists() throws PlaylistException, SQLException
	{
		return this.playlistService.getAllPlaylists();
	}
	@DeleteMapping("playlist/{id}")
	public void deletePlaylistById(@PathVariable("id") Integer id) throws PlaylistException, SQLException{
		this.playlistService.deletePlaylistById(id);
	}
	@PutMapping("updatePlaylist")
	public Playlist updatePlaylist(@RequestBody Playlist playlist)throws PlaylistException, SQLException{
		return this.playlistService.updatePlaylist(playlist);
	}

}