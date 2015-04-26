package single_table;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import comuns.Curso;
import comuns.SituacaoAluno;
import javax.persistence.Column;

@Entity
@DiscriminatorValue ("A")
public class Aluno_SingleTable extends Pessoa_SingleTable implements Serializable {
	
        @Column(name="CURSO_ALUNO")
	private Curso curso;	
	
        @Column(name="SITUACAO_ALUNO")
	private SituacaoAluno situacao;

	public Aluno_SingleTable() { 
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
