package br.edu.insper.desagil.pi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EcommerceTest {

	@Test
	void test1() {
		Vendedor joao = new Vendedor("Joao");
		Produto secador = new Produto("secador", 99.9);
		Vendedor antonio = new Vendedor("Antonio");
		Vendedor maria = new Vendedor("Maria");
		
		Video video1 = new Video(1, joao, secador);
		
		video1.adicionaAvalicao(maria, 0);
		video1.adicionaAvalicao(antonio, 7);
		video1.adicionaAvalicao(joao, 3);
		
		assertEquals(0, joao.totalAvaliacoes());
	}
	
	@Test
	void test2() {
		Vendedor joao = new Vendedor("Joao");
		Produto secador = new Produto("secador", 99.9);
		Vendedor maria = new Vendedor("Maria");
		
		Video video1 = new Video(1, joao, secador);
		
		video1.adicionaAvalicao(maria, 4);
		
		assertEquals(4, joao.totalAvaliacoes());
	}

}
