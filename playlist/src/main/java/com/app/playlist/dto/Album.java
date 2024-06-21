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
public class Album {
	

		@Id
		@GeneratedValue
	 	private Integer albumId;
	    private Integer createdAt;
	    private String title;
	    private String description;
	    private float totalLength;
	    private int songCount;
	    private String artistName;
	    @OneToMany(cascade=CascadeType.ALL)
	    private List<Song> song=new ArrayList<>();
//	    @ManyToOne	    
//	    private Artist artist;
		public Album(Integer albumId, Integer createdAt, String title, String description, float totalLength,
				int songCount, String artistName, List<Song> song) {
			super();
			this.albumId = albumId;
			this.createdAt = createdAt;
			this.title = title;
			this.description = description;
			this.totalLength = totalLength;
			this.songCount = songCount;
			this.artistName = artistName;
			this.song = song;
		}
		public Album() {
			super();
		}
		public Integer getAlbumId() {
			return albumId;
		}
		public void setAlbumId(Integer albumId) {
			this.albumId = albumId;
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
		public String getArtistName() {
			return artistName;
		}
		public void setArtistName(String artistName) {
			this.artistName = artistName;
		}
		public List<Song> getSong() {
			return song;
		}
		public void setSong(List<Song> song) {
			this.song = song;
		}
		@Override
		public String toString() {
			return "Album [albumId=" + albumId + ", createdAt=" + createdAt + ", title=" + title + ", description="
					+ description + ", totalLength=" + totalLength + ", songCount=" + songCount + ", artistName="
					+ artistName + ", song=" + song + "]";
		}
	    
	 
}
