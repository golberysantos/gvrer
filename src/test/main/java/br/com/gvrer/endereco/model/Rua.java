package br.com.gvrer.endereco.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("rua")
public class Rua {
	@Id
    private long ruaid;
    private String cep;
    private String logradouro;
    private long bairro_bairroid;
    
	public long getRuaid() {
		return ruaid;
	}
	public void setRuaid(long ruaid) {
		this.ruaid = ruaid;
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
}
