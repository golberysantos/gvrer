package br.com.gvrer.endereco.model;

import java.text.DecimalFormat;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("cidade")
public class Cidade {
	@Id
    private long cidadeid;
    private String nomecidade;
    private DecimalFormat latitude;
    private DecimalFormat longitude;
    private long estado_estadoid;
    
	public long getCidadeid() {
		return cidadeid;
	}
	public void setCidadeid(long cidadeid) {
		this.cidadeid = cidadeid;
	}
	public String getNomecidade() {
		return nomecidade;
	}
	public void setNomecidade(String nomecidade) {
		this.nomecidade = nomecidade;
	}
	public DecimalFormat getLatitude() {
		return latitude;
	}
	public void setLatitude(DecimalFormat latitude) {
		this.latitude = latitude;
	}
	public DecimalFormat getLongitude() {
		return longitude;
	}
	public void setLongitude(DecimalFormat longitude) {
		this.longitude = longitude;
	}
	public long getEstado_estadoid() {
		return estado_estadoid;
	}
	public void setEstado_estadoid(long estado_estadoid) {
		this.estado_estadoid = estado_estadoid;
	}
}
