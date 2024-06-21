package com.app.playlist.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Artist {
	

	@Id
	@GeneratedValue
    private Integer artistId;
    private String fullName;
    private int songCount;
    private int albumCount;
    @OneToMany(cascade=CascadeType.ALL)
    
    private List<Album> album=new ArrayList<>();
    //private List<Integer> albumIds; // we keep albums as a list of album ids in artist
  


	public List<Album> getAlbum() {
		return album;
	}


	public void setAlbum(List<Album> album) {
		this.album = album;
	}


	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getArtistId() {
		return artistId;
	}


	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public int getSongCount() {
		return songCount;
	}


	public void setSongCount(int songCount) {
		this.songCount = songCount;
	}


	public int getAlbumCount() {
		return albumCount;
	}


	public void setAlbumCount(int albumCount) {
		this.albumCount = albumCount;
	}


	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", fullName=" + fullName + ", songCount=" + songCount + ", albumCount="
				+ albumCount + "]";
	}
	
	

}
