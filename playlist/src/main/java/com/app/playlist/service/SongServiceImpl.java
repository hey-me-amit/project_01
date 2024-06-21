
package com.app.playlist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.playlist.dao.SongRepository;
import com.app.playlist.dto.Song;
import com.app.playlist.exception.SongException;

/************************************************************************************
 * @author Manas Agarwal Description It is a service class that provides the
 *         services for adding new songs, viewing a song by its id,viewing all
 *         songs,updating a song and deleting a song by its id
 * 
 *         Version 1.0 Created Date 8-Aug-2022
 ************************************************************************************/

@Service
public class SongServiceImpl implements SongService {
	@Autowired
	private SongRepository songRepository;

	/************************************************************************************
	 * Method: addSong Description:         To add a song into the database.
	 * 
	 * @param songObj -                     An object of type Song
	 * @returns -                           true, if transferred otherwise throws AccountException
	 * @throws SongException -              It is raised if song details are not filled properly
	 *                                      or if the song already exist in the database.
	 * 
	 ************************************************************************************/

	@Override
	public Song addSong(Song songObj) throws SongException {
		if (songObj == null) {
			throw new SongException("Song details cannot be null");
		} else {
			Optional<Song> song = this.songRepository.findById(songObj.getAlbumId());
			if (song.isPresent()) {
				throw new SongException("Song already exist");
			}
		}
		return this.songRepository.save(songObj);
	}

	/************************************************************************************
	 * Method: getSongById Description:    To get a song of a particular id from the
	 *                                     database
	 * 
	 * @param songId -                     Id of the generated song
	 * 
	 * @returns -                          get the song present with that particular id
	 * 
	 * @throws SongException -             It is raised if the song with that particular id does
	 *                                     not exist.
	 * 
	 * 
	 ************************************************************************************/

	@Override
	public Song getSongById(Integer songId) throws SongException {
		Optional<Song> song = this.songRepository.findById(songId);
		if (song.isEmpty()) {
			throw new SongException("Given Song id does not exist");
		} else {
			// TODO Auto-generated method stub
			return song.get();
		}
	}

	/************************************************************************************
	 * Method: deleteSongById Description:        To delete a song present in the database.
	 * 
	 * @param songId -                            Id of the song to be deleted
	 * @returns -                                 true, if transferred otherwise throws AccountException
	 * @throws SongException -                    It is raised if song to be deleted is not present in
	 *                                            the database.
	 * 
	 * 
	 * 
	 ************************************************************************************/
	@Override
	public void deleteSongById(Integer songId) throws SongException {
		Optional<Song> song = this.songRepository.findById(songId);
		if (song.isEmpty()) {
			throw new SongException("Song does not exist");
		} else {
			// TODO Auto-generated method stub

			this.songRepository.deleteById(songId);

		}
	}

	/************************************************************************************
	 * Method: getAllSongs Description: To get all songs present in the database
	 * 
	 * @returns -                       List of all songs
	 * @throws SongException -          it is raised if the song list is empty.
	 * 
	 * 
	 ************************************************************************************/
	@Override
	public List<Song> getAllSongs() throws SongException {
		List<Song> songList = this.songRepository.findAll();
		if (songList.isEmpty()) {
			throw new SongException("Song list is empty");
		}
		// TODO Auto-generated method stub
		else {
			return songList;
		}

	}

	/************************************************************************************
	 * Method: updateSong Description: To update information of a particular song
	 * 
	 * @param songObj -                An object of type Song
	 * @returns -                      song object
	 * @throws SongException -         it is raised if the song with that particular id does
	 *                                 not exist.
	 * 
	 * 
	 * 
	 ************************************************************************************/

	public Song updateSong(Song songObj) throws SongException {
		Optional<Song> song = this.songRepository.findById(songObj.getAlbumId());
		if (song.isEmpty()) {
			throw new SongException("Song id does not exist");
		} else
			return this.songRepository.save(songObj);
	}

	// TODO Auto-generated method stub

}
