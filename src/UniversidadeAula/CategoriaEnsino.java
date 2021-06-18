package UniversidadeAula;

public class CategoriaEnsino extends Escola {
	private String ead;
	private String presencial;

	public CategoriaEnsino(String nome, String ead, String presencial) {
		super(nome);
		this.ead = ead;
		this.presencial = presencial;
		
	}

	public String getEad() {
		return ead;
	}

	public void setEad(String ead) {
		this.ead = ead;
	}

	public String getPresencial() {
		return presencial;
	}

	public void setPresencial(String presencial) {
		this.presencial = presencial;
	}
	
}
