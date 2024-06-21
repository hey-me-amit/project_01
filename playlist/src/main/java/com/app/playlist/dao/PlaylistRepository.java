package com.app.playlist.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.playlist.dto.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist,Integer> {

}
