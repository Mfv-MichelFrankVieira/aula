package UniversidadeAula;

public class Principal {

	public static void main(String[] args) {
		//criar universidade
		Universidade PucPr = new Universidade("pontificia", "puc");
		//criar escolas
		Escola politecnica = new Escola("poli pr");
		Escola humanas = new Escola("humanas pr");
		Escola biologicas = new Escola("biologicas pr");
		Escola gestao = new Escola("gestao pr");
		//criar escolas
		Curso ads = new Curso("adspuc","puc");
		Curso gti = new Curso("gtipuc", "puc");
		Curso direito = new Curso("direitopuc", "puc");
		Curso biologia = new Curso("biologiapuc", "puc");
		Curso rh = new Curso("rhpuc", "puc");
		
		//relaciona cursos e escolas
		politecnica.listaCursos.add(ads);
		politecnica.listaCursos.add(gti);
		humanas.listaCursos.add(direito);
		biologicas.listaCursos.add(biologia);
		gestao.listaCursos.add(rh);
				
		//relaciona escolas e universidades
		PucPr.listaEscolas.add(politecnica);
		PucPr.listaEscolas.add(humanas);
		PucPr.listaEscolas.add(biologicas);
		PucPr.listaEscolas.add(gestao);
		
		//imprime
		System.out.println("Seja bem vindo ao sistema da "+ PucPr.getNome() +" "+ PucPr.getSigla());
		PucPr.imprimir();
	}
	
}
