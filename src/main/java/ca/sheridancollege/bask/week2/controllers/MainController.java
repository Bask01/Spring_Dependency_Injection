package ca.sheridancollege.bask.week2.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.bask.week2.beans.Message;

@Controller
public class MainController {
	
	@Autowired
	private Message msg;
	
	@GetMapping("/")
	public void index(HttpServletResponse response) {
		
		try {
			PrintWriter out = response.getWriter();
			out.println(msg);
			
		} catch (IOException ex) {
			ex.printStackTrace();
			
		}
		
	}
	
}
