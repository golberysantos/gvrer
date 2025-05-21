package br.com.gvrer.endereco.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("bairro")
public class Bairro {
	@Id
    private long bairroid;
    private String nomebairro;
    private long cidade_cidadeid;
    
	public long getBairroid() {
		return bairroid;
	}
	public void setBairroid(long bairroid) {
		this.bairroid = bairroid;
	}
	public String getNomebairro() {
		return nomebairro;
	}
	public void setNomebairro(String nomebairro) {
		this.nomebairro = nomebairro;
	}
	public long getCidade_cidadeid() {
		return cidade_cidadeid;
	}
	public void setCidade_cidadeid(long cidade_cidadeid) {
		this.cidade_cidadeid = cidade_cidadeid;
	}
}
