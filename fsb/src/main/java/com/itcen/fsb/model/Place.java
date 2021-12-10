package com.itcen.fsb.model;

import java.util.Date;

public class Place {
	int placeId = 0;
	String placeName = "";
	String placeAddress = "";
	String placeLat = "";
	String placeLng = "";
	String placeMenu = "";
	Date placeCreateDate = null;
	
	public Place(int placeId, String placeName, String placeAddress, String placeLat, String placeLng,
			String placeMenu, Date placeCreateDate, int ratings) {
		super();
		this.placeId = placeId;
		this.placeName = placeName;
		this.placeAddress = placeAddress;
		this.placeLat = placeLat;
		this.placeLng = placeLng;
		this.placeMenu = placeMenu;
		this.placeCreateDate = placeCreateDate;

	}

	public Place() {
		super();
	}


	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceAddress() {
		return placeAddress;
	}

	public void setPlaceAddress(String placeAddress) {
		this.placeAddress = placeAddress;
	}

	public String getPlaceLat() {
		return placeLat;
	}

	public void setPlaceLat(String placeLat) {
		this.placeLat = placeLat;
	}

	public String getPlaceLng() {
		return placeLng;
	}

	public void setPlaceLng(String placeLng) {
		this.placeLng = placeLng;
	}

	public String getPlaceMenu() {
		return placeMenu;
	}

	public void setPlaceMenu(String placeMenu) {
		this.placeMenu = placeMenu;
	}

	public Date getPlaceCreateDate() {
		return placeCreateDate;
	}

	public void setPlaceCreateDate(Date placeCreateDate) {
		this.placeCreateDate = placeCreateDate;
	}

	@Override
	public String toString() {
		return "PlaceVO [placeId=" + placeId + ", placeName=" + placeName + ", placeAddress=" + placeAddress
				+ ", placeLat=" + placeLat + ", placeLng=" + placeLng + ", placeMenu=" + placeMenu
				+ ", placeCreateDate=" + placeCreateDate + "]";
	}
	
}
