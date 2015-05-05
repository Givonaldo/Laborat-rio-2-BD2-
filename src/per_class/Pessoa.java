package per_class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;

@Entity
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public abstract class Pessoa {
	

	@TableGenerator ( name="SEQUENCIA_PESSOA",
			table="geradora_sequenciais",
			pkColumnName="nome_coluna_pk",
			valueColumnName="valor_sequencial_coluna_pk")
					
	@ Id
	@GeneratedValue ( strategy= GenerationType.TABLE,
	generator="SEQUENCIA_PESSOA" )
	private long id;
	
	private String nome;
	private long matricula;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
}
