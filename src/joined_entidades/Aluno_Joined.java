package joined_entidades;

import comuns.Curso;
import comuns.SituacaoAluno;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "JOINED_ALUNOS")
@PrimaryKeyJoinColumn(name = "ID_PESSOA")
public class Aluno_Joined extends Pessoa_Joined implements Serializable {

    private Curso curso;
    @Enumerated(EnumType.STRING)
    @Column(name = "SITUACAO")
    private SituacaoAluno situacao;

    public Aluno_Joined() {
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public SituacaoAluno getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoAluno situacao) {
        this.situacao = situacao;
    }
}
