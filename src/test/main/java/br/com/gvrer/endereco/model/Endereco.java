package br.com.gvrer.endereco.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("endereco")
public class Endereco {

    @Id
    private long enderecoid;
    private String numero;
    private String complemento;
    private String referencia;
    private long pessoa_pessoaid;
    private long rua_ruaid;
    
	public long getEnderecoid() {
		return enderecoid;
	}
	public void setEnderecoid(long enderecoid) {
		this.enderecoid = enderecoid;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public long getPessoa_pessoaid() {
		return pessoa_pessoaid;
	}
	public void setPessoa_pessoaid(long pessoa_pessoaid) {
		this.pessoa_pessoaid = pessoa_pessoaid;
	}
	public long getRua_ruaid() {
		return rua_ruaid;
	}
	public void setRua_ruaid(long rua_ruaid) {
		this.rua_ruaid = rua_ruaid;
	}
}
