package br.com.gvrer.fisica.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class StatusFisica {
@Id	
	private long statusfisicaid;
	private String descricao;
	public long getStatusfisicaid() {
		return statusfisicaid;
	}
	public void setStatusfisicaid(long statusfisicaid) {
		this.statusfisicaid = statusfisicaid;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
