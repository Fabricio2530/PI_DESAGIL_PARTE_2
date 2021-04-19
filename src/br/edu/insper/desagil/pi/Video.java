package br.edu.insper.desagil.pi;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<String, Integer> avalicaoes;

	
	
	public Video(int id, Usuario usuario, Produto produto) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avalicaoes = new HashMap<>();
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public Produto getProduto() {
		return this.produto;
	}

	public void adicionaAvalicao(Usuario usuario, int inteiro) {
		
		if ((this.usuario.getNome() != usuario.getNome()) && ((inteiro >=1 ) && (inteiro <= 5))) {
			this.avalicaoes.put(usuario.getNome(), inteiro);
		}
	}
	
	public int mediaAvaliacoes() {
		double quantidade = 0.0;
		double soma = 0.0;
		
		for (String nome: this.avalicaoes.keySet()) {
			soma += this.avalicaoes.get(nome);
			quantidade += 1;
		}
		
		double mediaDouble = soma/quantidade;
		
		long mediaLong = Math.round(mediaDouble);
		
		int mediaInt = (int) mediaLong;
		
		
		return mediaInt;
		
	}
}
