package com.app.playlist.dao;

import java.sql.SQLException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.playlist.dto.Song;
import com.app.playlist.exception.SongException;
@Repository
public interface SongRepository extends JpaRepository<Song,Integer>{
	
	

	

}
