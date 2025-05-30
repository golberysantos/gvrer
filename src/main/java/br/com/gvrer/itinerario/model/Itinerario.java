package br.com.gvrer.itinerario.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("itinerario")
public class Itinerario{
	@Id
	private long itinerarioid;  
	private String nomeitinerario;	
	private float valor;
	private String observacoes; 
	private String seguroviagem; 
	private String dataida;
	private String horaida; 
	private String datavolta;  
	private String horavolta;
	private long mmotivodaviagem_motivodaviagemid;
	
	public String getNomeitinerario() {
		return nomeitinerario;
	}
	public void setNomeitinerario(String nomeitinerario) {
		this.nomeitinerario = nomeitinerario;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public String getSeguroviagem() {
		return seguroviagem;
	}
	public void setSeguroviagem(String seguroviagem) {
		this.seguroviagem = seguroviagem;
	}
	public String getDataida() {
		return dataida;
	}
	public void setDataida(String dataida) {
		this.dataida = dataida;
	}
	public String getHoraida() {
		return horaida;
	}
	public void setHoraida(String horaida) {
		this.horaida = horaida;
	}
	public String getDatavolta() {
		return datavolta;
	}
	public void setDatavolta(String datavolta) {
		this.datavolta = datavolta;
	}
	public String getHoravolta() {
		return horavolta;
	}
	public void setHoravolta(String horavolta) {
		this.horavolta = horavolta;
	}
	public long getItinerarioid() {
		return itinerarioid;
	}
	public void setItinerarioid(long itinerarioid) {
		this.itinerarioid = itinerarioid;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public long getMmotivodaviagem_motivodaviagemid() {
		return mmotivodaviagem_motivodaviagemid;
	}
	public void setMmotivodaviagem_motivodaviagemid(long mmotivodaviagem_motivodaviagemid) {
		this.mmotivodaviagem_motivodaviagemid = mmotivodaviagem_motivodaviagemid;
	}
	
}
