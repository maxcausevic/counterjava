package com.mcausevic.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Counter {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}
		else{
			session.setAttribute("count", (Integer) session.getAttribute("count") +1);
		}
		return "index.jsp";
    }
	
//	public String counter(Model model) {
//		model.addAttribute("counter", session);
//		return "counter.jsp";
//    }
	@RequestMapping("/counter")
	public String counter(HttpSession session){
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}
        		return "counter.jsp";
        	
    }
}
