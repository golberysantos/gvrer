package br.com.gvrer.endereco.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("Endereco")
public class Endereco {
	@Id
	private long Endereco; 
	private String Rua;
	private String Complemento;  
	private String numero; 
	

	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		this.Rua = rua;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		this.Complemento = complemento;
	}
	public String getNumero() {
		return numero	;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void getEndereco() {
		// TODO Auto-generated method stub
		
	}
}
