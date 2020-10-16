package br.gov.caema.jsfdemo.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Named
@RequestScoped
public class IndexBean {
	private String nome;
	private String dataNascimento;
	
	public void enviar() {
		System.out.println(nome);
		System.out.println(dataNascimento);
	}
}
