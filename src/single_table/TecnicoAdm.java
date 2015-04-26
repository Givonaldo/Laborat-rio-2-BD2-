package single_table;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue ("T")
public class TecnicoAdm extends Pessoa {
	
	@Column(name="data_adm")
	private Date dataAdmicao;
	private String cargo;
	
	public TecnicoAdm() { }
	
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
