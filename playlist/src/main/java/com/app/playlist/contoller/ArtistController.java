package com.app.playlist.contoller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.playlist.dto.Artist;
import com.app.playlist.dto.Song;
import com.app.playlist.exception.ArtistException;
import com.app.playlist.exception.SongException;
import com.app.playlist.service.ArtistService;


@RestController
public class ArtistController {
	@Autowired
	private ArtistService artistService;
	
	@GetMapping("artist/{id}")
	public Artist getArtistById(@PathVariable("id") Integer id) throws ArtistException, SQLException {
		return this.artistService.getArtistById(id);
	}
	@PostMapping("artist")
	public Artist addArtist(@RequestBody Artist artist) throws ArtistException, SQLException{
		return this.artistService.createArtist(artist);
	}
	@GetMapping("artists")
	public List<Artist> getAllArtist() throws ArtistException, SQLException
	{
		return this.artistService.getAllArtist();
	}
	@DeleteMapping("artist/{id}")
	public void deleteArtistById(@PathVariable("id") Integer id) throws ArtistException, SQLException
	{
		this.artistService.deleteArtistById(id);
	}
	

}