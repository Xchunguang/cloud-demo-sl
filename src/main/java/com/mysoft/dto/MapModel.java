package com.mysoft.dto;

import java.util.List;

public class MapModel {

	List<MapDto> guolu;
	List<MapDto> kongtiao;
	public List<MapDto> getGuolu() {
		return guolu;
	}
	public void setGuolu(List<MapDto> guolu) {
		this.guolu = guolu;
	}
	public List<MapDto> getKongtiao() {
		return kongtiao;
	}
	public void setKongtiao(List<MapDto> kongtiao) {
		this.kongtiao = kongtiao;
	}
	public MapModel() {
		super();
	}
	
	
}
