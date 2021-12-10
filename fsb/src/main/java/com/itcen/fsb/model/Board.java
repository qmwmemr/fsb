package com.itcen.fsb.model;

import java.util.Date;

public class Board {
	int boardId = 0;
	String boardContent = "";
	String memberId = "";
	int placeId = 0;
	int ratingId = 0;
	Date boardCreateDate = null;
	Date boardModifyDate = null;
	String boardIp = "";
	int boardCount = 0;
	public Board(int boardId, String boardContent, String memberId, int placeId, int ratingId,
			Date boardCreateDate, Date boardModifyDate, String boardIp, int boardCount) {
		super();
		this.boardId = boardId;

		this.boardContent = boardContent;
		this.memberId = memberId;
		this.placeId = placeId;
		this.ratingId = ratingId;
		this.boardCreateDate = boardCreateDate;
		this.boardModifyDate = boardModifyDate;
		this.boardIp = boardIp;
		this.boardCount = boardCount;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getPlaceId() {
		return placeId;
	}
	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public Date getBoardCreateDate() {
		return boardCreateDate;
	}
	public void setBoardCreateDate(Date boardCreateDate) {
		this.boardCreateDate = boardCreateDate;
	}
	public Date getBoardModifyDate() {
		return boardModifyDate;
	}
	public void setBoardModifyDate(Date boardModifyDate) {
		this.boardModifyDate = boardModifyDate;
	}
	public String getBoardIp() {
		return boardIp;
	}
	public void setBoardIp(String boardIp) {
		this.boardIp = boardIp;
	}
	public int getBoardCount() {
		return boardCount;
	}
	public void setBoardCount(int boardCount) {
		this.boardCount = boardCount;
	}
	@Override
	public String toString() {
		return "BoardVO [boardId=" + boardId + ", boardContent=" + boardContent
				+ ", memberId=" + memberId + ", placeId=" + placeId + ", ratingId=" + ratingId + ", boardCreateDate="
				+ boardCreateDate + ", boardModifyDate=" + boardModifyDate + ", boardIp=" + boardIp + ", boardCount="
				+ boardCount + "]";
	}
	
	
	
}
