package projeto_banco_digital_dio;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();

	void transferir(double valor, Conta contaDestino);
}
