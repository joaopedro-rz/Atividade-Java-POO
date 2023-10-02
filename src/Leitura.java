//Joao Pedro Ribeiro Zugaib ; Ra: 2525844
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
	
	public String entDados(String info) {
		
		System.out.println(info);
		BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));

		try {
			return leitura.readLine();
		} catch (IOException e) {
			System.out.println("Erro de leitura. Por favor, tente novamente.");
			e.printStackTrace();
			return null;
		}
	}
}
