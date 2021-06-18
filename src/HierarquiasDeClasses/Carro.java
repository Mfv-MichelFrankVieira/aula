/*
 * EXERC�CIO
Buscando similaridades
Vamos trabalhar nos exemplos passados na Figura 1, para ver como esses conceitos s�o traduzidos em c�digo Java.

Crie um projeto com as classes carro, moto e main  no mesmo pacote default, como indicado.
Execute o projeto a partir da classe main.
Ap�s isso:
Quais m�todos e atributos id�nticos as classes moto e carro possuem?
Existe algum m�todo em comum, cuja implementa��o n�o seja id�ntica? Reflita: o significado do m�todo � o mesmo em ambos os casos?
Agora, observe a classe main. H� trechos de c�digos realizando praticamente as mesmas opera��es? Quais s�o eles?
O que aconteceria na classe main se mais classes fossem inseridas?
 */
package HierarquiasDeClasses;

public class Carro {
	private String marca;
	private String motor;
	private int portaMalas;

	public Carro(String marca, String motor, int portaMalas) {
		this.marca = marca;
		this.motor = motor;
		this.portaMalas = portaMalas;
		
	}

	public String getMarca() {
		return marca;
	}

	public String getMotor() {
		return motor;
	}

	public int getPortaMalas() {
		return portaMalas;
	}

	public String imprimir() {
		return "Marca: " + getMarca() + ", Motor: " + getMotor() + " Porta malas: " + getPortaMalas() + " litros.";
	}
}