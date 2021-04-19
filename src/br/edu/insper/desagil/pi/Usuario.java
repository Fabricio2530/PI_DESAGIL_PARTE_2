package br.edu.insper.desagil.pi;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
		this.videos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	
	
	public void postaVideo(int id, Produto produto) {
		Video novoVideo = new Video(id, this, produto);
		
		this.videos.add(novoVideo);
	}
	
	public int totalAvaliacoes() {
		int soma = 0;
		
		for (Video video: this.videos) {
			soma += video.mediaAvaliacoes();
		}
		
		return soma;
	}
	
}
