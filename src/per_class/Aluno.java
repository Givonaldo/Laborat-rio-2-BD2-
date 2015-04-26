package per_class;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Aluno extends Pessoa {
	
	public Aluno() { }
	
	private Curso curso;	
	
	private SitucaoAluno situacao;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public SitucaoAluno getSituacao() {
		return situacao;
	}

	public void setSituacao(SitucaoAluno situacao) {
		this.situacao = situacao;
	}
	
	
	
}
