package br.com.neighborhoodStore.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cliente {

	private String nome;
	private int socio;
	List<Compra> compras = new LinkedList<Compra>();

	public Cliente(String nome, int socio) {

		this.nome = nome;
		this.socio = socio;
	}

	public String getNome() {
		return nome;
	}

	public int getSocio() {
		return socio;
	}

	public List<Compra> getCompras() {
		return Collections.unmodifiableList(compras);
	}

	public void adiciona(Compra c) {
		this.compras.add(c);
	}

	// implementação do método através da sintaxe do Java 8
	public double getValorTotal() {
		return this.compras.stream().mapToDouble(Compra::getValor).sum();
	}

	@Override
	public String toString() {
		return "Cliente: " + this.nome + "\nRegistro de sócio número: " + this.socio;
	}

}
