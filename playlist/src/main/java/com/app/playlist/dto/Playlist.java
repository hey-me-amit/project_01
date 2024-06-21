package com.app.playlist.dto;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Playlist {
	

	@Id
	@GeneratedValue
	private Integer playListId;
    @NotNull(message="Title can't be null or Empty")
    @Size(min=3,max=30,message="Playlist Title must be greater than 3 chars and max of 30 chars")
    private String title;
    @NotNull(message="Description can't be null or empty")
    @NotBlank(message="Description is mandatory")
    private String description;
    private float totalLength;
    private int songCount;
    private Integer createdById;
    private String createdByName;
    private int createdAt;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Song> songs=new ArrayList<>();
    
  
    
	
	 /* @OneToOne
	  private User user;
	 
	  public User getUser() {
		  return user; 
		  }
	  
	 public void setUser(User user) {
		 this.user = user; 
		 }*/
	 

	
    
	


	



	public List<Song> getSongs() {
		return songs;
	}



	







	public Playlist(Integer playListId,
@NotNull(message = "Title can't be null or Empty") @Size(min = 3, max = 30, 
message = "Playlist Title must be greater than 3 chars and max of 30 chars") String title,
@NotNull(message = "Description can't be null or empty") @NotBlank(message = "Description is mandatory") String description,
      float totalLength, int songCount, Integer createdById, String createdByName, int createdAt,
			List<Song> songs) {
		super();
		this.playListId = playListId;
		this.title = title;
		this.description = description;
		this.totalLength = totalLength;
		this.songCount = songCount;
		this.createdById = createdById;
		this.createdByName = createdByName;
		this.createdAt = createdAt;
		this.songs = songs;
	}











	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}



	public Playlist() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Playlist(Integer userId) {
		// TODO Auto-generated constructor stub
	}

	public Integer getPlayListId() {
		return playListId;
	}


	public void setPlayListId(Integer playListId) {
		this.playListId = playListId;
	}

	


	public int getCreatedAt() {
		return createdAt;
	}











	public void setCreatedAt(int createdAt) {
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


	public float getTotalLength() {
		return totalLength;
	}


	public void setTotalLength(float totalLength) {
		this.totalLength = totalLength;
	}


	public int getSongCount() {
		return songCount;
	}


	public void setSongCount(int songCount) {
		this.songCount = songCount;
	}


	public Integer getCreatedById() {
		return createdById;
	}


	public void setCreatedById(Integer createdById) {
		this.createdById = createdById;
	}


	public String getCreatedByName() {
		return createdByName;
	}


	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}


	
}