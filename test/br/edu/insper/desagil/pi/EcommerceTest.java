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
		
		Video videoSecador = joao.postaVideo(1, secador);
		
		videoSecador.adicionaAvalicao(maria, 0);
		videoSecador.adicionaAvalicao(antonio, 7);
		videoSecador.adicionaAvalicao(joao, 3);
		
		assertEquals(0, joao.totalAvaliacoes());
	}
	
	@Test
	void test2() {
		Vendedor joao = new Vendedor("Joao");
		Produto secador = new Produto("secador", 99.9);
		Vendedor maria = new Vendedor("Maria");
		
		
		Video videoSecador = joao.postaVideo(1, secador);
		videoSecador.adicionaAvalicao(maria, 4);
		
		assertEquals(4, joao.totalAvaliacoes());
	}
	
	@Test
	void test3() {
		Vendedor joao = new Vendedor("Joao");
		Produto maquinaDeLavar = new Produto("máquina de lavar", 499.9);
		Vendedor maria = new Vendedor("Maria");
		Vendedor Alessandra = new Vendedor("Alessandra");
		
		
		Video videoMaquinaDeLavar = joao.postaVideo(1, maquinaDeLavar);
		videoMaquinaDeLavar.adicionaAvalicao(maria, 4);
		videoMaquinaDeLavar.adicionaAvalicao(Alessandra, 5);
		
		assertEquals(5, joao.totalAvaliacoes());
	}
	
	@Test
	void test4() {
		Vendedor joao = new Vendedor("Joao");
		Produto liquidificador = new Produto("Liquidificador", 120.9);
		Vendedor maria = new Vendedor("Maria");
		Vendedor Alessandra = new Vendedor("Alessandra");
		Vendedor Rogerio = new Vendedor("Rogerio");
		
		
		Video videoLiquidificador = joao.postaVideo(1, liquidificador);
		videoLiquidificador.adicionaAvalicao(maria, 3);
		videoLiquidificador.adicionaAvalicao(Alessandra, 4);
		videoLiquidificador.adicionaAvalicao(Rogerio, 3);
		
		
		assertEquals(3, joao.totalAvaliacoes());
	}
	
	@Test
	void test5() {
		Vendedor joao = new Vendedor("Joao");
		Produto geladeira = new Produto("Geladeira", 4000.0);
		Produto batedeira = new Produto("Batedeira Profissional", 430.5);
		Vendedor maria = new Vendedor("Maria");
		Vendedor Alessandra = new Vendedor("Alessandra");
		Vendedor Rogerio = new Vendedor("Rogerio");
		
		
		Video videoGeladeira = joao.postaVideo(1, geladeira);
		videoGeladeira.adicionaAvalicao(maria, 3);
		
		Video videoBatedeira = joao.postaVideo(2, batedeira);
		
		videoBatedeira.adicionaAvalicao(Alessandra, 4);
		videoBatedeira.adicionaAvalicao(Rogerio, 3);
		
		
		assertEquals(6, joao.totalAvaliacoes());
	}

}
