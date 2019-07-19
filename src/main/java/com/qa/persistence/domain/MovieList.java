package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 100)
	private Integer imdbId;
	@Column(length = 100)
	private String title;
	@Column(length = 100)
	private Integer year;
	@Column(length = 100)
	private String genre;
	@Column(length = 100)
	private String plot;
	@Column(length = 100)
	private Float imdbRating;
	@Column(length = 100)
	private String poster;
	
	public MovieList(Integer id, Integer imdbId, String title, Integer year, String genre, String plot,
			Float imdbRating, String poster) {
		super();
		this.id = id;
		this.imdbId = imdbId;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.plot = plot;
		this.imdbRating = imdbRating;
		this.poster = poster;
	}
	
	public MovieList() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getImdbId() {
		return imdbId;
	}

	public void setImdbId(Integer imdbId) {
		this.imdbId = imdbId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public Float getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(Float imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}
	
	


	
	

}
