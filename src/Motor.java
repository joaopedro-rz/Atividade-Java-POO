//Joao Pedro Ribeiro Zugaib ; Ra: 2525844
public class Motor {

	private int qtdPistoes;
	private int potencia;

	public Motor(int qtdPistoes, int potencia) {
		this.qtdPistoes = qtdPistoes;
		this.potencia = potencia;
	}
	
	// Getters

	public int getQtdPistoes() {
		return qtdPistoes;
	}

	public int getPotencia() {
		return potencia;
	}

	// Setters
	public void setQtdPistoes(int qtdPistoes) {
		this.qtdPistoes = qtdPistoes;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
