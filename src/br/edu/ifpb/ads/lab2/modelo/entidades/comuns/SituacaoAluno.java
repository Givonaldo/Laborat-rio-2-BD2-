package br.edu.ifpb.ads.lab2.modelo.entidades.comuns;

public enum SituacaoAluno {

    ARQUIVADO("Matricula_Trancada"),
    CANCELADO("Matricula_Cancelada"),
    MATRICULADO("Matricula_Ativa");
    
    private String titulo;
    
    private SituacaoAluno(String titulo) {
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

}
