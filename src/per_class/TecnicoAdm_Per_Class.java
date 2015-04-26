package per_class;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "PER_CLASS_TECNICO_ADM")
public class TecnicoAdm_Per_Class extends Pessoa_Per_Class {
	
	@Column(name="DATA_ADMISSAO_TECNICO_ADM")
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dataAdmicao;
        @Column(name="CARGO_TECNICO_ADM")
	private String cargo;
	
	public TecnicoAdm_Per_Class() { }
	
	public Date getDataAdmicao() {
		return dataAdmicao;
	}
	public void setDataAdmicao(Date dataAdmicao) {
		this.dataAdmicao = dataAdmicao;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
}
