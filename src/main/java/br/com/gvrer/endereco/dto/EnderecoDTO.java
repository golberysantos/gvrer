package br.com.gvrer.endereco.dto;

public class EnderecoDTO {
	
	// tabela país
	private String nomepais;
	private String siglapais;
	
	private String nomeestado;
	private String uf;
	private long pais_paisid;
	
	private String nomecidade;
	private long estado_estadoid;
	
	private String nomebairro;
	private long cidade_cidadeid;
	
	private String cep;
	private String logradouro;
	private long bairro_bairroid;
	
	private String numero;
	private String complemento;
	private String referencia;
	private long pessoa_pessoaid;
	private long rua_ruaid;
	
	public String getNomepais() {
		return nomepais;
	}
	public void setNomepais(String nomepais) {
		this.nomepais = nomepais;
	}
	public String getSiglapais() {
		return siglapais;
	}
	public void setSiglapais(String siglapais) {
		this.siglapais = siglapais;
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
	public String getNomecidade() {
		return nomecidade;
	}
	public void setNomecidade(String nomecidade) {
		this.nomecidade = nomecidade;
	}
	public long getEstado_estadoid() {
		return estado_estadoid;
	}
	public void setEstado_estadoid(long estado_estadoid) {
		this.estado_estadoid = estado_estadoid;
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
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public long getBairro_bairroid() {
		return bairro_bairroid;
	}
	public void setBairro_bairroid(long bairro_bairroid) {
		this.bairro_bairroid = bairro_bairroid;
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
