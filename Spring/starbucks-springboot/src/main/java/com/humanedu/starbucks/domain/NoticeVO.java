package com.humanedu.starbucks.domain;

import lombok.Data;

@Data
public class NoticeVO {
	private int num;
	private String name;
	private String subject;
	private String content;
	private int hit;
	private String regdate;
}
