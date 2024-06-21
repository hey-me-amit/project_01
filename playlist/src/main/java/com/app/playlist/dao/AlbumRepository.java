package com.app.playlist.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.playlist.dto.Album;


public interface AlbumRepository  extends JpaRepository<Album,Integer> {
	
}
	
