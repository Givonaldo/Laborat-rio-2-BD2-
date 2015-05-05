package single_table;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name="pessoa")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn ( name="discriminador", discriminatorType= DiscriminatorType.STRING)
public abstract class Pessoa {
	
	@Id
	@GeneratedValue
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
