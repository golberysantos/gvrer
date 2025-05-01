package br.com.gvrer.segmento.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("tiposegmento")
public class Segmento {

	@Id
	private long tiposegmento;
	private String nometiposegmento;

	public long getTiposegmento() {
		return tiposegmento;
	}

	public void setTiposegmento(long tiposegmento) {
		this.tiposegmento = tiposegmento;
	}

	public String getNometiposegmento() {
		return nometiposegmento;
	}

	public void setNometiposegmento(String nometiposegmento) {
		this.nometiposegmento = nometiposegmento;
	}

}
