package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

//POJO- Plain Old Java Object
//semplice contenitore di dati senza logica

/**
 * Memorizza il risultato di un esame singolo
 * 
 * @author ilari
 *
 */
public class Voto {
	private String nome;
	private int voto; //30L come lo rappresento?
	private LocalDate data;
	
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public String toString()
	{
		return "Esame "+nome+" superato con "+voto+" il "+data;
	}
	

}
