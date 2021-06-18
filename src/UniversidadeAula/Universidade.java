package UniversidadeAula;

import java.util.ArrayList;

public class Universidade {
	//Atributos 
	private String nome;
	private String sigla;
	//Lista escolas
	ArrayList<Escola> listaEscolas;
	//Construtora
	public Universidade(String nome, String sigla)
	{
		this.nome = nome;
		this.sigla = sigla; 
		listaEscolas = new ArrayList<Escola>();
	}
	//Getter e Setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	//Imprime
		public void imprimir() {
		
		for(Escola e : this.listaEscolas) {
					System.out.println(e.getNome());
					System.out.println("Cursos: ");
					for(Curso c : e.listaCursos ){
						System.out.println("    "+ c.getCodCurso());
					}
				} 
		}
}
