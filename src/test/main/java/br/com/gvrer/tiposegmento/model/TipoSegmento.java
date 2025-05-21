package br.com.gvrer.tiposegmento.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("tiposegmento")
public class TipoSegmento {

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

	public String getculinaria() {
		// TODO Auto-generated method stub
		return null;
	}

}
