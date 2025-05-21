package br.com.gvrer.categoriaitem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("categoriaitem")
public class CategoriaItem {
	@Id
	private long categoriaitemid;
	private String nomecategoriaitem;
	
	public long getCategoriaitemid() {
		return categoriaitemid;
	}
	public void setCategoriaitemid(long categoriaitemid) {
		this.categoriaitemid = categoriaitemid;
	}
	public String getNomecategoriaitem() {
		return nomecategoriaitem;
	}
	public void setNomecategoriaitem(String nomecategoriaitem) {
		this.nomecategoriaitem = nomecategoriaitem;
	}
	
	

}
