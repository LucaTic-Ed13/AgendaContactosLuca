package com.example.agenda.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.agenda.model.Contacto;
import com.example.agenda.services.ContactoService;

@Controller
public class HomeController {

	@Autowired
	private ContactoService contactoService;
	
	@RequestMapping("/agenda")
	public ModelAndView handleRequest() throws Exception {
		List<Contacto> listContactos = contactoService.list();
		ModelAndView model = new ModelAndView("ContactoList");
		model.addObject("contactoList", listContactos);
		return model;
	}
}
