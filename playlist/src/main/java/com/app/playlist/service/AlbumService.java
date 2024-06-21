package com.app.playlist.service;

import java.util.List;

import com.app.playlist.dto.Album;

public interface AlbumService {
	Album createAlbum(Album album);
	Album getAlbumById(Integer albumId);
	List<Album> getAllAlbums();
	void deleteAlbumById(Integer albumId);
	

}
