package br.com.gradle.ear.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.gradle.ear.service.HomeService;

@Controller // Informa ao SpringMVC que esta classe � um controller
public class HomeController {

	@Autowired
	private HomeService homeService;

	@RequestMapping("/") // tem a fun��o de definir que o metodo atende a um determinado path ou endere�o. Neste caso estamos definindo que o metodo index atender� as requisi��es que chegarem na raiz do nosso projeto ("/").
	public String index(){
		System.out.println(homeService.getMessage());
		return "home";
	}

}
