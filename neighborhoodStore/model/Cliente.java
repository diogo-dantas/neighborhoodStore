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


}
