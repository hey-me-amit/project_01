package com.app.playlist.dto;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Song {
	
	
	@Id
	@GeneratedValue
    private Integer songid;
    private Integer createdAt;
    @NotNull(message="Title cannot be null")
	@NotBlank()
    private String title;
    private String description;
    private float length;
    @NotNull(message="Artist Name cannot be null")
	@NotBlank()
    private String artistName;
    private Integer albumId; // we only keep album's id in song
    private String albumName;
	public Song(Integer songid, Integer createdAt, @NotNull(message = "Title cannot be null") @NotBlank String title,
			String description, float length,
			@NotNull(message = "Artist Name cannot be null") @NotBlank String artistName, Integer albumId,
			String albumName) {
		super();
		this.songid = songid;
		this.createdAt = createdAt;
		this.title = title;
		this.description = description;
		this.length = length;
		this.artistName = artistName;
		this.albumId = albumId;
		this.albumName = albumName;
	}
	public Song() {
		super();
	}
	public Integer getSongid() {
		return songid;
	}
	public void setSongid(Integer songid) {
		this.songid = songid;
	}
	public Integer getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Integer createdAt) {
		this.createdAt = createdAt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public Integer getAlbumId() {
		return albumId;
	}
	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

    
    
}
