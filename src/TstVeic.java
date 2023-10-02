// Joao Pedro Ribeiro Zugaib ; Ra: 2525844
public class TstVeic {

    public static void main(String[] args) {
        // leitura de dados usando a classe Leitura para Motor
        Leitura leituraMotor = new Leitura();
        System.out.println("Cadastre o veiculo de Passeio:\n");
        int qtdPistoes = Integer.parseInt(leituraMotor.entDados("Digite a quantidade de pistões do motor do carro passeio: "));
        int potencia = Integer.parseInt(leituraMotor.entDados("Digite a potência do motor(cavalos): "));

        // leitura de dados usando a classe Leitura para Passeio
        Leitura leituraPasseio = new Leitura();
        String placaPasseio = leituraPasseio.entDados("Digite a placa do veículo de Passeio: ");
        String marcaPasseio = leituraPasseio.entDados("Digite a marca do veículo de Passeio: ");
        String modeloPasseio = leituraPasseio.entDados("Digite o modelo do veículo de Passeio: ");
        String corPasseio = leituraPasseio.entDados("Digite a cor do veículo de Passeio: ");
        int qtdRodasPasseio = Integer.parseInt(leituraPasseio.entDados("Digite a quantidade de rodas do veículo de Passeio: "));
        int velocMaxPasseio = Integer.parseInt(leituraPasseio.entDados("Digite a velocidade máxima do veículo de Passeio em Km/h: "));
        String dataCadastroPasseio = leituraPasseio.entDados("Digite a data de cadastro do veículo de Passeio: ");
        int numPassageirosPasseio = Integer.parseInt(leituraPasseio.entDados("Digite o número de passageiros do veículo de Passeio: "));

        // Criando um novo objeto Passeio com dados inseridos pelo usuário
        Passeio passeio = new Passeio(placaPasseio, marcaPasseio, modeloPasseio, corPasseio, qtdRodasPasseio, velocMaxPasseio, null, dataCadastroPasseio, numPassageirosPasseio);
        passeio.setMotor(passeio.criarMotor(qtdPistoes, potencia));

        // leitura de dados usando a classe Leitura para Carga
        System.out.println("Agora cadastre o veiculo de carga:\n");
        int qtdPistoesCarga = Integer.parseInt(leituraMotor.entDados("Digite a quantidade de pistões do motor do carro Carga: "));
        int potenciaCarga = Integer.parseInt(leituraMotor.entDados("Digite a potência do motor(cavalos): "));

        Leitura leituraCarga = new Leitura();
        String placaCarga = leituraCarga.entDados("Digite a placa do veículo de Carga: ");
        String marcaCarga = leituraCarga.entDados("Digite a marca do veículo de Carga: ");
        String modeloCarga = leituraCarga.entDados("Digite o modelo do veículo de Carga: ");
        String corCarga = leituraCarga.entDados("Digite a cor do veículo de Carga: ");
        int qtdRodasCarga = Integer.parseInt(leituraCarga.entDados("Digite a quantidade de rodas do veículo de Carga: "));
        int velocMaxCarga = Integer.parseInt(leituraCarga.entDados("Digite a velocidade máxima do veículo de Carga em Km/h: "));
        String dataCadastroCarga = leituraCarga.entDados("Digite a data de cadastro do veículo de Carga: ");
        int taraCarga = Integer.parseInt(leituraCarga.entDados("Digite a tara do veículo de Carga: "));
        int cargaMaxCarga = Integer.parseInt(leituraCarga.entDados("Digite o número da carga máxima do veículo de Carga: "));

        // Criando um novo objeto Carga com dados inseridos pelo usuário
        Carga carga = new Carga(placaCarga, marcaCarga, modeloCarga, corCarga, qtdRodasCarga, velocMaxCarga, null, dataCadastroCarga, taraCarga, cargaMaxCarga);
        carga.setMotor(passeio.getMotor()); // Usando o mesmo motor do veículo de passeio

        // Exibindo todos os dados do veículo de Passeio
        System.out.println("\nDados do veículo de Passeio:\n");
        System.out.println("Placa: " + passeio.getPlaca());
        System.out.println("Marca: " + passeio.getMarca());
        System.out.println("Modelo: " + passeio.getModelo());
        System.out.println("Cor: " + passeio.getCor());
        System.out.println("Quantidade de Rodas: " + passeio.getQtdRodas());
        System.out.println("Velocidade Máxima: " + passeio.getVelocMax());
        System.out.println("Data de Cadastro: " + passeio.getDataCadastro());
        System.out.println("Número de Passageiros: " + passeio.getQtdPassageiros());
    	// Dados do Motor
        Motor motorPasseio = passeio.getMotor();
        System.out.println("\nDados do Motor do Passeio:");
        System.out.println("Quantidade de Pistões: " + motorPasseio.getQtdPistoes());
        System.out.println("Potência: " + motorPasseio.getPotencia());
        // Chamando o método calcVel para Passeio e exibindo a velocidade em M/h
        int velocidadePasseio = passeio.calcVel();
        System.out.println("Velocidade do Passeio em M/h: " + velocidadePasseio);
        // Chamando o método calcular() e exibindo o resultado para Passeio
        int resultadoCalculoPasseio = passeio.calcular();
        System.out.println("Resultado do cálculo para o Passeio: " + resultadoCalculoPasseio);

        // Exibindo todos os dados do veículo de Carga
        System.out.println("\nDados do veículo de Carga:\n");
        System.out.println("Placa: " + carga.getPlaca());
        System.out.println("Marca: " + carga.getMarca());
        System.out.println("Modelo: " + carga.getModelo());
        System.out.println("Cor: " + carga.getCor());
        System.out.println("Quantidade de Rodas: " + carga.getQtdRodas());
        System.out.println("Velocidade Máxima: " + carga.getVelocMax());
        System.out.println("Data de Cadastro: " + carga.getDataCadastro());
        System.out.println("Tara: " + carga.getTara());
        System.out.println("Carga Máxima: " + carga.getCargaMax());
        // Dados do Motor
        Motor motorCarga = carga.getMotor();
        System.out.println("\nDados do Motor da Carga:");
        System.out.println("Quantidade de Pistões: " + motorCarga.getQtdPistoes());
        System.out.println("Potência: " + motorCarga.getPotencia());
        // Chamando o método calcVel para Carga e exibindo a velocidade em Cm/h
        int velocidadeCarga = carga.calcVel();
        System.out.println("Velocidade da Carga em Cm/h: " + velocidadeCarga);
        // Chamando o método calcular() e exibindo o resultado para Carga
        int resultadoCalculoCarga = carga.calcular();
        System.out.println("Resultado do cálculo para a Carga: " + resultadoCalculoCarga);
    }
}
