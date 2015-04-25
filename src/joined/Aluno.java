package joined;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn (name="ID_PESSOA")
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
