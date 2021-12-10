package com.itcen.fsb.model;

public class Rating {
	int ratingId = 0;
	int placeId = 0;
	String memberId = "";
	int rating = 0;
	
	public Rating() {
		super();
	}

	public Rating(int ratingId, int placeId, String memberId, int rating) {
		super();
		this.ratingId = ratingId;
		this.placeId = placeId;
		this.memberId = memberId;
		this.rating = rating;
	}

	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "RatingVO [ratingId=" + ratingId + ", placeId=" + placeId + ", memberId=" + memberId + ", rating="
				+ rating + "]";
	}
	
	
}
