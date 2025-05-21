package br.com.gvrer.tipopermissaodogrupo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("tipopermissaodogrupo")
public class TipoPermissaoDoGrupo {
    @Id
    private long tipopermissaodogrupoid; // A chave primária foi renomeada
    private String nomepermissao;

    public long getTipopermissaodogrupoid() {
        return tipopermissaodogrupoid;
    }

    public void setTipopermissaodogrupoid(long tipopermissaodogrupoid) {
        this.tipopermissaodogrupoid = tipopermissaodogrupoid;
    }

    public String getNomepermissao() {
        return nomepermissao;
    }

    public void setNomepermissao(String nomepermissao) {
        this.nomepermissao = nomepermissao;
    }
}
