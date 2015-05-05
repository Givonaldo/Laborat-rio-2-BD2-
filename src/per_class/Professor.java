package per_class;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
public class Professor extends Pessoa {

	@Column(name="data_professor")
	private Date dataAdmicao;
	private String areaDeAtuacao;
	
	public Professor() { }

	public Date getDataAdmicao() {
		return dataAdmicao;
	}

	public void setDataAdmicao(Date dataAdmicao) {
		this.dataAdmicao = dataAdmicao;
	}

	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}
	
	
	
}
