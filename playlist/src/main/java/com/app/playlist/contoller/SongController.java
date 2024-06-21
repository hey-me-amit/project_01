package com.app.playlist.contoller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.playlist.dao.SongRepository;
import com.app.playlist.dto.Song;
import com.app.playlist.exception.SongException;
import com.app.playlist.service.SongService;



@RestController
public class SongController {
	@Autowired
	private SongService songService;
	
	@GetMapping("song/{id}")
	public Song getSongById(@PathVariable("id") Integer id) throws SongException {
		return this.songService.getSongById(id);
	}
		
	@PostMapping("song")
	public Song addSong(@Valid @RequestBody Song song) throws SongException{
		return this.songService.addSong(song);
	}
	@GetMapping("songs")
	public List<Song> getAllSongs() throws SongException{
	
		return this.songService.getAllSongs();
	}
	@DeleteMapping("song/{id}")
	public void DeleteSongById(@PathVariable("id") Integer id) throws SongException {
	this.songService.deleteSongById(id);
	}
	@PutMapping("updateSong")
	public Song updateSong(@Valid @RequestBody Song song) throws SongException {
		return this.songService.updateSong(song);
	}
	
	
	}





