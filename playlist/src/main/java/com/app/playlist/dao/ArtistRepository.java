package com.app.playlist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.playlist.dto.Album;
import com.app.playlist.dto.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Integer>{


	

}
