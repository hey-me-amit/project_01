package com.app.playlist.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.playlist.dao.ArtistRepository;
import com.app.playlist.dto.Artist;
import com.app.playlist.dto.Song;
import com.app.playlist.exception.ArtistException;
import com.app.playlist.exception.SongException;
@Service
public class ArtistServiceImpl implements ArtistService {
	@Autowired
	private ArtistRepository artistRepository;

	@Override
	public Artist createArtist(Artist artistObj) throws ArtistException, SQLException {
		// TODO Auto-generated method stub
		return this.artistRepository.save(artistObj);
	}

	@Override
	public Artist getArtistById(Integer artistId) throws ArtistException, SQLException {
		// TODO Auto-generated method stub
		Optional<Artist> artist=this.artistRepository.findById(artistId);
		if(artist.isEmpty()) {
			throw new ArtistException("Given Artist id does not exist");
		}
			else
			{
		// TODO Auto-generated method stub
		return artist.get();
			}
	}
	

	@Override
	public void deleteArtistById(Integer artistId) throws ArtistException, SQLException {
		// TODO Auto-generated method stub
		Optional<Artist> artist =this.artistRepository.findById(artistId);
		if(artist.isEmpty()) {
			throw new ArtistException("Given Artist id does not exist");
		}
		else
		{
			 this.artistRepository.deleteById(artistId);
		}
		
		
	}
		
	

	@Override
	public List<Artist> getAllArtist() throws ArtistException, SQLException {
		// TODO Auto-generated method stub
		return this.artistRepository.findAll();
	}
}

	