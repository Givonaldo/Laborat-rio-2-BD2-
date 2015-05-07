package br.edu.ifpb.ads.lab2.modelo.entidades.comuns;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Curso implements Serializable {

    @Column(name = "NOME_CURSO")
    private String nome;

    public Curso() { }

    public String getDescricao() {
        return nome;
    }

    public void setDescricao(String nome) {
        this.nome = nome;
    }

}
