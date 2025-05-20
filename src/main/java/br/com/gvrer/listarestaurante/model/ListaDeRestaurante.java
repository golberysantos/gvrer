package br.com.gvrer.listarestaurante.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("listaderestaurante")
public class ListaDeRestaurante {

	@Id
	private long listaderestaurante;
	private String nomerestaurante;

	public long getTiposegmento() {
		return listaderestaurante;
	}

	public void setTiposegmento(long listaderestaurante) {
		this.listaderestaurante = listaderestaurante;
	}

	public String getNometiposegmento() {
		return nomerestaurante;
	}

	public void setNometiposegmento(String nomerestaurante) {
		this.nomerestaurante = nomerestaurante;
	}

}
