package com.app.playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.playlist.dto.Song;
import com.app.playlist.exception.SongException;
import com.app.playlist.service.SongService;


@SpringBootApplication
public class PlaylistApplication implements CommandLineRunner{
	//@Autowired
    //SongService songService;
	public static void main(String[] args) {
		SpringApplication.run(PlaylistApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	}
}