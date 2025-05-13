package br.com.gvrer.tipopermissaodogrupo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("tipopermissaodogrupo")
public class TipoPermissaoDoGrupo {
	@Id
	private long tipopermissaodogrupo; 
	private String tipopermissaodogrupoid;
	private String nomepermissao; 
	

}
