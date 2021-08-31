package com.mega.mvc07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@RequestMapping("bbs")
	public void bbs(BbsDTO bDto, String date) {
		System.out.println(bDto);
	}
}
