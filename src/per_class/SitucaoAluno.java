package per_class;

public enum SitucaoAluno {
	
	MATRICULADO("Matricula_Ativa"), ARQUIVADO("Matricula_Trancada"), CANCELADO("Matricula_Cancelada"); 
	
	String titulo;
	private SitucaoAluno(String titulo) {
		this.titulo = titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
}
