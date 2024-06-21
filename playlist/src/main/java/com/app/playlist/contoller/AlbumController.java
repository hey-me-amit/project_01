package com.app.playlist.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.playlist.dao.AlbumRepository;
import com.app.playlist.dto.Album;
import com.app.playlist.service.AlbumService;

@RestController
public class AlbumController {
	@Autowired
	private AlbumService albumService;

	@PostMapping("album")
	public Album addAlbum(@RequestBody  Album album) {
		return this.albumService.createAlbum(album);

	}
	@GetMapping("album/{id}")
	
		public Album getAlbumById(@PathVariable("id") Integer id) {
		return this.albumService.getAlbumById(id);
	}
	@GetMapping("albums")
	public List<Album> getAllAlbums(){
		return this.albumService.getAllAlbums();
	}
	@DeleteMapping("album/{id}")
	public void deleteAlbumById(@PathVariable("id") Integer id) {
		this.albumService.deleteAlbumById(id);
	}

}
