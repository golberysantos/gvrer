package br.com.gvrer.itemrestaurante.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("itemrestaurante")
public class Itemrestaurante {
	@Id
	private long itemrestauranteid; 
	private String nomeitem;
	private String ingredientes; 
	private String descricao; 
	private float valor; 
	private String imagemitem; 
	private long origemitemrestaurante_origemrestauranteid; 
	private long especialidadedoitem_nomeespecialidadedoitem;
	
	
	public long getItemrestauranteid() {
		return itemrestauranteid;
	}
	public void setItemrestauranteid(long itemrestauranteid) {
		this.itemrestauranteid = itemrestauranteid;
	}
	public String getNomeitem() {
		return nomeitem;
	}
	public void setNomeitem(String nomeitem) {
		this.nomeitem = nomeitem;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagemitem() {
		return imagemitem;
	}
	public void setImagemitem(String imagemitem) {
		this.imagemitem = imagemitem;
	}
	public long getOrigemitemrestaurante_origemrestauranteid() {
		return origemitemrestaurante_origemrestauranteid;
	}
	public void setOrigemitemrestaurante_origemrestauranteid(long origemitemrestaurante_origemrestauranteid) {
		this.origemitemrestaurante_origemrestauranteid = origemitemrestaurante_origemrestauranteid;
	}
	public long getEspecialidadedoitem_nomeespecialidadedoitem() {
		return especialidadedoitem_nomeespecialidadedoitem;
	}
	public void setEspecialidadedoitem_nomeespecialidadedoitem(long especialidadedoitem_nomeespecialidadedoitem) {
		this.especialidadedoitem_nomeespecialidadedoitem = especialidadedoitem_nomeespecialidadedoitem;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	

}
