package br.com.gvrer.pessoa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class Pessoa {
@Id
private long pessoaid;
private long tipocontatoid;
private String datanascimento;
public long getPessoaid() {
	return pessoaid;
}
public void setPessoaid(long pessoaid) {
	this.pessoaid = pessoaid;
}
public long getTipocontatoid() {
	return tipocontatoid;
}
public void setTipocontatoid(long tipocontatoid) {
	this.tipocontatoid = tipocontatoid;
}
public String getDatanascimento() {
	return datanascimento;
}
public void setDatanascimento(String datanascimento) {
	this.datanascimento = datanascimento;
}
}
