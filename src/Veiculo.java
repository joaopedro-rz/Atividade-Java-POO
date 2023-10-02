//Joao Pedro Ribeiro Zugaib ; Ra: 2525844
public abstract class Veiculo {
	 
	 protected String placa;
	 protected String marca;
	 protected String modelo;
	 protected String cor;
	 protected int qtdRodas;
	 protected int velocMax;
	 protected Motor motor;
	 protected String dataCadastro;

	public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor,
			String dataCadastro) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.qtdRodas = qtdRodas;
		this.velocMax = (velocMax < 10 || velocMax > 250) ? 100 : velocMax;
		this.motor = motor;
		this.dataCadastro = dataCadastro;
	}

	// Getters
	public final String getPlaca() {
		return placa;
	}

	public final String getMarca() {
		return marca;
	}

	public final String getModelo() {
		return modelo;
	}

	public final String getCor() {
		return cor;
	}

	public final int getQtdRodas() {
		return qtdRodas;
	}

	public final int getVelocMax() {
		return velocMax;
	}

	public final Motor getMotor() {
		return motor;
	}

	public final String getDataCadastro() {
		return dataCadastro;
	}

	// Setters
	public final void setPlaca(String placa) {
		this.placa = placa;
	}

	public final void setMarca(String marca) {
		this.marca = marca;
	}

	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public final void setCor(String cor) {
		this.cor = cor;
	}

	public final void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public final void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}

	public final void setMotor(Motor motor) {
		this.motor = motor;
	}

	public final void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
    public final Motor criarMotor(int qtdPistoes, int potencia) {
        return new Motor(qtdPistoes, potencia);
    }

	public abstract int calcVel();
}
