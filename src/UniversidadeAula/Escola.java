package UniversidadeAula;

import java.util.ArrayList;

public class Escola {
	private String nome;
	ArrayList<Curso> listaCursos;
	public Escola(String nome) {
		this.nome = nome;
		listaCursos = new ArrayList<Curso>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Curso> getListaCursos() {
		return listaCursos;
	}
	public void setListaCursos(ArrayList<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}
	
}
