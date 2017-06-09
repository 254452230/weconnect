package com.tech.wcserv.vo;

import java.io.Serializable;

public class BlogVO implements Serializable{

	private static final long serialVersionUID = 2396831905146711197L;
	
	private Integer id;
	private Integer seq;
	private String title;
	private String link;
	private String type;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
