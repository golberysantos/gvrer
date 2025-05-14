package br.com.gvrer.grupo.model;

import java.security.Timestamp;
import java.sql.Time;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("grupo")
public class Grupo {
	@Id
	private long grupoid;
	private String nomegrupo;
	private String linkgrupo;
	private Double orcamanetototal;
	private Timestamp datacriacao;
	private Timestamp dataviagem;
	private String descricao;
	private long qtdparticipantes;
	
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
	public Double getOrcamanetototal() {
		return orcamanetototal;
	}
	public void setOrcamanetototal(Double orcamanetototal) {
		this.orcamanetototal = orcamanetototal;
	}
	public Timestamp getDatacriacao() {
		return datacriacao;
	}
	public void setDatacriacao(Timestamp datacriacao) {
		this.datacriacao = datacriacao;
	}
	public Timestamp getDataviagem() {
		return dataviagem;
	}
	public void setDataviagem(Timestamp dataviagem) {
		this.dataviagem = dataviagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getQtdparticipantes() {
		return qtdparticipantes;
	}
	public void setQtdparticipantes(long qtdparticipantes) {
		this.qtdparticipantes = qtdparticipantes;
	}

	
}
