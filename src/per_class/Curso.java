package per_class;

import javax.persistence.Entity;

@Entity
public class Curso {
	
	private long id;
	private String descricao;	
	
	public Curso() { }
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
