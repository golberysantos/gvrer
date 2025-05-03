package br.com.gvrer.fisica.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class Genero {
@Id	
	private long generoid;
	private String nomegenero;
	public long getGeneroid() {
		return generoid;
	}
	public void setGeneroid(long generoid) {
		this.generoid = generoid;
	}
	public String getNomegenero() {
		return nomegenero;
	}
	public void setNomegenero(String nomegenero) {
		this.nomegenero = nomegenero;
	}
}
