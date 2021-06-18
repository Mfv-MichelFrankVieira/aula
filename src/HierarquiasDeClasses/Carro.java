/*
 * EXERCÍCIO
Buscando similaridades
Vamos trabalhar nos exemplos passados na Figura 1, para ver como esses conceitos são traduzidos em código Java.

Crie um projeto com as classes carro, moto e main  no mesmo pacote default, como indicado.
Execute o projeto a partir da classe main.
Após isso:
Quais métodos e atributos idênticos as classes moto e carro possuem?
Existe algum método em comum, cuja implementação não seja idêntica? Reflita: o significado do método é o mesmo em ambos os casos?
Agora, observe a classe main. Há trechos de códigos realizando praticamente as mesmas operações? Quais são eles?
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