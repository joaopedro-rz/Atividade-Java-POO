//Joao Pedro Ribeiro Zugaib ; Ra: 2525844
import java.lang.Override;

public final class Passeio extends Veiculo implements Calc{

	private int qtdPassageiros;

    public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int qtdPassageiros) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
        this.qtdPassageiros = qtdPassageiros;
    }

	// Getters
	public final int getQtdPassageiros() {
		return qtdPassageiros;
	}

	// Setters
	public final void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

    @Override
    public int calcVel() {
        // Implementação específica para Passeio
        return getVelocMax() * 1000; // Exemplo: convertendo para metros por hora
    }

    @Override
    public int calcular() {
        // Soma das quantidades de letras em todos os atributos do tipo String
        int somaLetras = contarLetras(getPlaca()) + contarLetras(getMarca()) + contarLetras(getModelo()) + contarLetras(getCor());
        return somaLetras;
    }

    private int contarLetras(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

}

