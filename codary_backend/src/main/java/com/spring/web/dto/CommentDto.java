package com.spring.web.dto;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "CommentDto : 댓글정보",description = "댓글 정보를 나타냄")
public class CommentDto {

	private int commentNum;
	private int blogContentsId;
	private String blogId;
	private int commentLike;
	private String commentContent;
	private String uid;
	private String commentDatetime;

	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	public int getBlogContentsId() {
		return blogContentsId;
	}

	public void setBlogContentsId(int blogContentsId) {
		this.blogContentsId = blogContentsId;
	}

	public String getBlogId() {
		return blogId;
	}

	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}

	public int getCommentLike() {
		return commentLike;
	}

	public void setCommentLike(int commentLike) {
		this.commentLike = commentLike;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCommentDatetime() {
		return commentDatetime;
	}

	public void setCommentDatetime(String commentDatetime) {
		this.commentDatetime = commentDatetime;
	}

	@Override
	public String toString() {
		return "CommentDto [commentNum=" + commentNum + ", blogContentsId=" + blogContentsId + ", blogId=" + blogId
				+ ", commentLike=" + commentLike + ", commentContent=" + commentContent + ", uid=" + uid
				+ ", commentDatetime=" + commentDatetime + "]";
	}

}
