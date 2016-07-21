package br.com.gradle.ear.service;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import br.com.gradle.ear.entity.Produto;

@Component
public class HomeService implements Serializable {

	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Entrando tela inicial - HomeController.index";
	}
	
	public Produto getProduto() {
		Produto produto = new Produto();
		produto.setDescricao("TV SONY 40 POLEGADAS");
		return produto;
	}

}