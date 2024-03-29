package org.zerock.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.service.BoardService;
import org.zerock.service.ReplyService;

import java.util.List;

@Log4j
@Controller
@AllArgsConstructor
public class BoardController {

	private BoardService service;
	private ReplyService replyService;

//	@AllArgsConstructor 와 같음
//	public BoardController(BoardService service){
//		this.service = service;
//	}



	@GetMapping("/")//list
	public String list(Criteria cri, Model model) {
		log.info("list");
		List<BoardVO> boardVOList = service.getList(cri);
		model.addAttribute("boardList",boardVOList);
		model.addAttribute("criteria",cri);
		return "/board/list";
	}

	@GetMapping("/board/register")
	public void register(){

	}

	/*
	* 게시물 등록
	* @param board
	* @param rttr
	* @return
	* */

	@PostMapping("/board/register")
	public String register(BoardVO board, RedirectAttributes rttr){
		log.info("register: "+ board);

		service.register(board);

		rttr.addFlashAttribute("result",board.getBno());
		return "redirect:/";
	}

	@GetMapping("/board/get")
	public void get(@RequestParam("bno") Long bno, Model model){
		log.info("/get");
		model.addAttribute("board",service.get(bno));
		model.addAttribute("replyTotalCount", replyService.getTotalCount(bno));
		model.addAttribute("views",service.views(bno));
	}

	@GetMapping("/board/modify")
	public void modify(@RequestParam("bno") Long bno, Model model){
		log.info("/modify");
		model.addAttribute("board",service.get(bno));
	}

	@PostMapping("/board/modify")
	public String modify(BoardVO board, RedirectAttributes rttr){
		log.info("modify"+board);

		if (service.modify(board)){
			rttr.addFlashAttribute("result","success");
		}
		return "redirect:/";
	}

	@PostMapping("/board/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr){
		log.info("remove...."+bno);

		if (service.remove(bno)){
			rttr.addFlashAttribute("result","success");
		}
		return "redirect:/";
	}
}
