package HierarquiasDeClasses;

public class Moto {
	private String marca;
	private String motor;
	private int cilindradas;

	public Moto(String marca, String motor, int cilindradas) {
		this.marca = marca;
		this.motor = motor;
		this.cilindradas = cilindradas;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getMarca() {
		return marca;
	}

	public String getMotor() {
		return motor;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public String imprimir() {
		return "Marca: " + getMarca() + ", Motor: " + getMotor() + " de " + getCilindradas() + " cilindradas.";
	}
}
