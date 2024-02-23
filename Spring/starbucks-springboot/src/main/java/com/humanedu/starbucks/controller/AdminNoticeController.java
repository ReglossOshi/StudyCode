package com.humanedu.starbucks.controller;

import java.util.List;

import com.humanedu.starbucks.mapper.NoticeMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.humanedu.starbucks.domain.NoticeVO;

@Controller
public class AdminNoticeController {
	@RequestMapping("/adminNoticeList")
	public String adminNoticeList(Model model) {
		NoticeVO test1 = new NoticeVO();
		model.addAttribute("boardList",test1);
		return "/adminNotice";
	}
	
	@RequestMapping("/adminNoticeInsert")
	public String adminNoticeInsert() {
		return "/adminNoticeInsertForm";
	}
	
	@RequestMapping("/adminNoticeUpdate")
	public String adminNoticeUpdate() {
		return "/adminNoticeUpdateForm";
	}
}
