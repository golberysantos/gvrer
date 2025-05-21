package br.com.gvrer.usuario.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class StatusUsuario {
@Id	
private long statususuarioid;
private String descricao;
public long getStatususuarioid() {
	return statususuarioid;
}
public void setStatususuarioid(long statususuarioid) {
	this.statususuarioid = statususuarioid;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}

}
