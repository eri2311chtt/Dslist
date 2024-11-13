package com.devsuperior.Dslist.dto;

import com.devsuperior.Dslist.entities.Game;
import com.devsuperior.Dslist.projections.GameMinProjetion;



public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year =entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public GameMinDTO(GameMinProjetion projetion) {
		id = projetion.getId();
		title = projetion.getTitle();
		year = projetion.getGameYear();
		imgUrl = projetion.getImgUrl();
		shortDescription = projetion.getShortDescription();
	}
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

}

