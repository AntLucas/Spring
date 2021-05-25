package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicios")
public class HelloController {
	
	/*
	 *Atividade 1 Spring-boot (minha primeira aplicação):
	 *Crie uma aplicação spring de hello world.
	 *	
	 *A aplicação deverá conter um end-point que retorna
	 *uma string com as habilidades e mentalidades que você
	 *utilizou para realizar essa atividade.
	  */
	
	
	@GetMapping("/atividade1")
	public String atividade1() {
		return "Para desenvolver essa atividade eu utilizei a mentalidade de "
				+ "persistência e a habilidade de atenção aos detalhes.";
	}
	
	/*
	 *Atividade 2 Spring-boot (minha segunda aplicação):
	 *Crie uma aplicação spring de hello world.
	 *
	 *A aplicação deverá conter um end-point que retorna
	 *uma string com os seus objetivos de aprendizagem para
	 *essa semana.
	*/
	
	@GetMapping("/atividade2")
	public String atividade2() {
		return "Nessa semana eu gostaria de aprender todo o conteúdo passado sobre o"
				+ " framework spring e conseguir aplicar esse conteúdo em aplicações";
	}
}
