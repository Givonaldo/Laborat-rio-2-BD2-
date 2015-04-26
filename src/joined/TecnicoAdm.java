package joined;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn (name="id")
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
