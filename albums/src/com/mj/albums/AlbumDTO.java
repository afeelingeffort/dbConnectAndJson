package com.mj.albums;

public class AlbumDTO {
	private int userId;
	private int id;
	private String title;

	public AlbumDTO() {
	}

	public AlbumDTO(int userId, int id, String title) {
		this.userId = userId;
		this.id = id;
		this.title = title;
	}

	@Override
	public String toString() {
		return "AlbumDTO [userId=" + userId + ", id=" + id + ", title=" + title + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
