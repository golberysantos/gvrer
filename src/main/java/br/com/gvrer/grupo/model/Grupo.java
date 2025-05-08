package br.com.gvrer.grupo.model;

import java.security.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("grupo")
public class Grupo {
	@Id
	private long grupoid;
	private String nomegrupo;
	private String linkgrupo;
	private Timestamp datacriacao;
	private String descricao;
	public long getGrupoid() {
		return grupoid;
	}
	public void setGrupoid(long grupoid) {
		this.grupoid = grupoid;
	}
	public String getNomegrupo() {
		return nomegrupo;
	}
	public void setNomegrupo(String nomegrupo) {
		this.nomegrupo = nomegrupo;
	}
	public String getLinkgrupo() {
		return linkgrupo;
	}
	public void setLinkgrupo(String linkgrupo) {
		this.linkgrupo = linkgrupo;
	}
	public Timestamp getDatacriacao() {
		return datacriacao;
	}
	public void setDatacriacao(Timestamp datacriacao) {
		this.datacriacao = datacriacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
