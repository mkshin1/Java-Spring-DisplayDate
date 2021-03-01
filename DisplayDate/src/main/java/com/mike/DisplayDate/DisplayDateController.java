package com.mike.DisplayDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) throws ParseException {
		String date =  new SimpleDateFormat("EEEE, dd MMMM, YYYY", Locale.ENGLISH).format(new Date());
	

		model.addAttribute("date", date);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) throws ParseException {
		String t =  new SimpleDateFormat("hh:mm a", Locale.ENGLISH).format(new Date());
		model.addAttribute("time", t);
		return "time.jsp";
	}
}