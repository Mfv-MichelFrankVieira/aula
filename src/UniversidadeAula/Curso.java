package UniversidadeAula;

public class Curso {
	private String codCurso;
	private String nomeCurso;
	public Curso(String codCurso,String nomeCurso) {
		this.codCurso = codCurso;
		this.nomeCurso = nomeCurso;
	}
	public String getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
}
