package br.com.gvrer.usuario.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class Usuario {
	@Id
	private long usuarioid;
	private String nickname; 
	private String senha;
	private long pessoa_pessoaid; 
	private long statususuario_statususuarioid;
	
	public long getUsuarioid() {
		return usuarioid;
	}
	public void setUsuarioid(long usuarioid) {
		this.usuarioid = usuarioid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public long getPessoa_pessoaid() {
		return pessoa_pessoaid;
	}
	public void setPessoa_pessoaid(long pessoa_pessoaid) {
		this.pessoa_pessoaid = pessoa_pessoaid;
	}
	public long getStatususuario_statususuarioid() {
		return statususuario_statususuarioid;
	}
	public void setStatususuario_statususuarioid(long statususuario_statususuarioid) {
		this.statususuario_statususuarioid = statususuario_statususuarioid;
	}
	
}
