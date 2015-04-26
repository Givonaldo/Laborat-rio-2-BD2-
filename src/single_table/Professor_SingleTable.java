package single_table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;


@Entity
@DiscriminatorValue ("P")
public class Professor_SingleTable extends Pessoa_SingleTable {

	@Column(name="DATA_ADMISSAO_PROFESSOR")
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dataAdmicao;
        @Column(name="AREA_ATUACAO_PROFESSOR")
	private String areaDeAtuacao;
	
	public Professor_SingleTable() { }

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
