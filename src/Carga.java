//Joao Pedro Ribeiro Zugaib ; Ra: 2525844
import java.lang.Override;

public final class Carga extends Veiculo implements Calc {

	private int tara;
	private int cargaMax;

	public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor,
			String dataCadastro, int tara, int cargaMax) {
		super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
		this.tara = tara;
		this.cargaMax = cargaMax;
	}

	// Getters
	public final int getTara() {
		return tara;
	}

	public final int getCargaMax() {
		return cargaMax;
	}

	// Setters
	public final void setTara(int tara) {
		this.tara = tara;
	}

	public final void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

    @Override
    public int calcVel() {
        // Implementação específica para Carga
        return getVelocMax() * 1000 * 100; // Exemplo: convertendo para centímetros por hora
    }

    @Override
    public int calcular() {
        // Soma de todos os valores de todos os atributos numéricos
        int somaNumerica = getQtdRodas() + getVelocMax() + getTara() + getCargaMax();
        return somaNumerica;
    }
}
