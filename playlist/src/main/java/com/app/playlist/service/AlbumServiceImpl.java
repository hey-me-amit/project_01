package com.app.playlist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.playlist.dao.AlbumRepository;
import com.app.playlist.dao.ArtistRepository;
import com.app.playlist.dto.Album;
import com.app.playlist.dto.Artist;
@Service
public class AlbumServiceImpl implements AlbumService{
	@Autowired
	private AlbumRepository albumRepository;
	
	@Autowired
	private ArtistRepository artistRepository;

	@Override
	public Album createAlbum(Album albumObj) {
	
	    return this.albumRepository.save(albumObj);
		
		
	}
		// TODO Auto-generated method stub

	@Override
	public Album getAlbumById(Integer albumId) {
		// TODO Auto-generated method stub
		Optional<Album> album=this.albumRepository.findById(albumId);
		/*if(album.isEmpty()) {
			//
		}
		else {
			return album.get();
		}*/
		return album.get();
	}

	@Override
	public List<Album> getAllAlbums() {
		// TODO Auto-generated method stub
		return this.albumRepository.findAll();
	}

	@Override
	public void deleteAlbumById(Integer albumId) {
		//Optional<Album> album=this.albumRepository.findById(albumId);
		 this.albumRepository.deleteById(albumId);
		// TODO Auto-generated method stub
		
	}
	
	}

	
