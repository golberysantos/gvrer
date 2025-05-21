package br.com.gvrer.endereco.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("estado")
public class Estado {
	@Id
    private long estadoid;
    private String nomeestado;
    private String uf;
    private long pais_paisid;
    
	public long getEstadoid() {
		return estadoid;
	}
	public void setEstadoid(long estadoid) {
		this.estadoid = estadoid;
	}
	public String getNomeestado() {
		return nomeestado;
	}
	public void setNomeestado(String nomeestado) {
		this.nomeestado = nomeestado;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public long getPais_paisid() {
		return pais_paisid;
	}
	public void setPais_paisid(long pais_paisid) {
		this.pais_paisid = pais_paisid;
	}
}
