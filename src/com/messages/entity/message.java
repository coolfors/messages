package com.messages.entity;

/**
 * @author coolfors
 * @date 2018年10月23日 上午10:23:43
 * @description:
 *
 */
public class message {
	private int userId;
	private String messageId;
	private String status;
	private String content;
	private String fromId;
	private String getId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFromId() {
		return fromId;
	}
	public void setFromId(String fromId) {
		this.fromId = fromId;
	}
	public String getGetId() {
		return getId;
	}
	public void setGetId(String getId) {
		this.getId = getId;
	}
	@Override
	public String toString() {
		return "message [userId=" + userId + ", messageId=" + messageId + ", status=" + status + ", content=" + content
				+ ", fromId=" + fromId + ", getId=" + getId + "]";
	}
	public message(int userId, String messageId, String status, String content, String fromId, String getId) {
		super();
		this.userId = userId;
		this.messageId = messageId;
		this.status = status;
		this.content = content;
		this.fromId = fromId;
		this.getId = getId;
	}
	
	public message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

