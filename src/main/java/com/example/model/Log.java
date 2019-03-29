package com.example.model;

import java.math.BigDecimal;

public class Log {
	
	private BigDecimal id;
	private String content;
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
